package com.lucas_couto.to_do_list.mappers;

import com.lucas_couto.to_do_list.dtos.TaskDto;
import com.lucas_couto.to_do_list.models.Task;

public class TaskMapper {

    public static Task fromDtoToEntity(TaskDto dto){
        return Task.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .completed(dto.getCompleted())
                .build();
    }

}
