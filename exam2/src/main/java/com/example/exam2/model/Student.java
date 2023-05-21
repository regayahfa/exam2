package com.example.exam2.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    @NotEmpty(message = "id must not be Empty")
    private int id;
    @NotEmpty(message = "name must not be Empty")
    private String name;
    @NotEmpty(message = "salary must not be Empty")
    private String salary;
}
