package com.student.api.controller;

import com.student.api.StudentDTO;
import com.student.api.entity.Student;
import com.student.api.service.StudentService;
import com.student.api.repository.StudentRepository;

import jakarta.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;
           
       @PostMapping("/students")
public ResponseEntity<?> createStudent(@Valid @RequestBody StudentDTO studentDTO, BindingResult result) {
    if (result.hasErrors()) {
        Map<String, String> errors = new HashMap<>();
        result.getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    Student student = new Student();
    student.setName(studentDTO.getStudentName());
    student.setEmail(studentDTO.getStudentEmail());
    // Set other fields

    studentRepository.save(student);

    return ResponseEntity.ok(student);
}



    // 1️⃣ Create a Student
    @PostMapping
    public Student createStudent(@RequestBody @Valid Student student) {
        return studentService.saveStudent(student);
    }

    // 2️⃣ Get all Students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // 3️⃣ Get Student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // 4️⃣ Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@Valid @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // 5️⃣ Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}

    



