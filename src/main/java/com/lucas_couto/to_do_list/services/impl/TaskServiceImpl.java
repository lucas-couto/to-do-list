package com.lucas_couto.to_do_list.services.impl;

import com.lucas_couto.to_do_list.dtos.TaskDto;
import com.lucas_couto.to_do_list.exceptions.NotFoundException;
import com.lucas_couto.to_do_list.mappers.TaskMapper;
import com.lucas_couto.to_do_list.models.Task;
import com.lucas_couto.to_do_list.repositories.TaskRepository;
import com.lucas_couto.to_do_list.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Void create(TaskDto dto) {
        Task task = TaskMapper.fromDtoToEntity(dto);
        this.taskRepository.save(task);
        return null;
    }

    @Override
    public List<Task> findAll() {
        return this.taskRepository.findAll();
    }

    @Override
    public Optional<Task> find(Long id) {
        var task = this.taskRepository.findById(id);
        if(task.isEmpty()) throw new NotFoundException("Tarefa não encontrada");

        return task;
    }

    @Override
    public Void update(Long id, TaskDto dto) {
        var taskOptional = this.taskRepository.findById(id);
        if(taskOptional.isEmpty()) throw new NotFoundException("Tarefa não encontrada");

        var task = taskOptional.get();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setCompleted(dto.getCompleted());

        this.taskRepository.save(task);

        return null;
    }

    @Override
    public Void delete(Long id) {
        this.taskRepository.deleteById(id);
        return null;
    }
}
