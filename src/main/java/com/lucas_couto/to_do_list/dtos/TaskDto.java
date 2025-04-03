package com.lucas_couto.to_do_list.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Long id;

    @NotBlank(message = "campo não pode ser nulo ou indefinido")
    private String title;

    private String description;

    private Boolean completed = false;
}
