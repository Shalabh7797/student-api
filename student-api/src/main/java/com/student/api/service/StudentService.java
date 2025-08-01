package com.student.api.service;

import com.student.api.dto.StudentDTO;


import java.util.List;

public interface StudentService {
    StudentDTO saveStudent(StudentDTO studentDTO);
    List<StudentDTO> getAllStudents();
    StudentDTO getStudentById(Long id);
    StudentDTO updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
    
}
