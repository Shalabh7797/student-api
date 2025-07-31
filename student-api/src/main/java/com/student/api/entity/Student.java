package com.student.api.entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     
    @NotBlank(message = "Name is mandatory")
private String name;

@Email(message = "Invalid email format")
private String email;

private String course;
private String status;


}
