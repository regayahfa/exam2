package com.example.exam2.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Teacher {
    @NotEmpty(message = " id must not be Empty")
    @Size(min = 2,max = 6)
    private int id;
    @NotEmpty(message = "name must not be Empty")
    private String name;
    @NotEmpty(message = "age must not be Empty")
    @Size(max=2)
    private int age;
    @NotEmpty(message = "major must not be Empty")
    private String major;
}
