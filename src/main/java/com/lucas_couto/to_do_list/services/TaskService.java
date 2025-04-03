package com.lucas_couto.to_do_list.services;

import com.lucas_couto.to_do_list.dtos.TaskDto;
import com.lucas_couto.to_do_list.models.Task;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    Void create(TaskDto dto);

    List<Task> findAll();

    Optional<Task> find(Long id);

    Void update(Long id, TaskDto dto);

    Void delete(Long id);
}
