package com.student.api.service;

import com.student.api.dto.StudentRequest;
import com.student.api.dto.StudentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    StudentResponse create(StudentRequest request);
    StudentResponse getById(Long id);
    Page<StudentResponse> list(Pageable pageable);
    StudentResponse update(Long id, StudentRequest request);
    void delete(Long id);
}
