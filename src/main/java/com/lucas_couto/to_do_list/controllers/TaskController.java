package com.lucas_couto.to_do_list.controllers;

import com.lucas_couto.to_do_list.dtos.TaskDto;
import com.lucas_couto.to_do_list.models.Task;
import com.lucas_couto.to_do_list.services.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody TaskDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<Task>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Task>> find(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.find(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @Valid @RequestBody TaskDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.delete(id));
    }

}
