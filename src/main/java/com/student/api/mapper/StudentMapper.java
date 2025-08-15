package com.student.api.mapper;

import com.student.api.dto.StudentRequest;
import com.student.api.dto.StudentResponse;
import com.student.api.entity.Student;

public class StudentMapper {

    public static Student toEntity(StudentRequest req) {
        Student s = new Student();
        s.setName(req.getName());
        s.setEmail(req.getEmail());
        s.setCourse(req.getCourse());
        return s;
    }

    public static StudentResponse toResponse(Student s) {
        return new StudentResponse(
                s.getId(), s.getName(), s.getEmail(), s.getCourse(), s.getCreatedAt(), s.getUpdatedAt()
        );
    }

    public static void updateEntity(Student s, StudentRequest req) {
        s.setName(req.getName());
        s.setEmail(req.getEmail());
        s.setCourse(req.getCourse());
    }
}
