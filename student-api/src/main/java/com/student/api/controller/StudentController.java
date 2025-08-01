package com.student.api.controller;
import com.student.api.dto.StudentDTO;

import com.student.api.entity.Student;
import com.student.api.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// StudentController.java
@SuppressWarnings("unused")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentDTO createStudent(@RequestBody @Valid StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentDTO updateStudent(@PathVariable Long id, @Valid @RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(id, studentDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}




