package com.lucas_couto.to_do_list.repositories;

import com.lucas_couto.to_do_list.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}
