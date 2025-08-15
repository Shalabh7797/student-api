package com.student.api.service.impl;

import com.student.api.dto.StudentRequest;
import com.student.api.dto.StudentResponse;
import com.student.api.entity.Student;
import com.student.api.exception.NotFoundException;
import com.student.api.mapper.StudentMapper;
import com.student.api.repository.StudentRepository;
import com.student.api.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentResponse create(StudentRequest request) {
        Student s = StudentMapper.toEntity(request);
        Student saved = repository.save(s);
        return StudentMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public StudentResponse getById(Long id) {
        Student s = repository.findById(id).orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        return StudentMapper.toResponse(s);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<StudentResponse> list(Pageable pageable) {
        return repository.findAll(pageable).map(StudentMapper::toResponse);
    }

    @Override
    public StudentResponse update(Long id, StudentRequest request) {
        Student s = repository.findById(id).orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        StudentMapper.updateEntity(s, request);
        Student updated = repository.save(s);
        return StudentMapper.toResponse(updated);
    }

    @Override
    public void delete(Long id) {
        Student s = repository.findById(id).orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        repository.delete(s);
    }
}
