package com.example.application.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@MappedSuperclass
@Data
public class People {
    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank
    @Column(name = "surname", nullable = false)
    private String surname;

    @NotBlank
    @Column(name = "age", nullable = false)
    private int age;
}
