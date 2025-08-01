// src/main/java/com/student/api/dto/StudentDTO.java
package com.student.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    private String course;
}
