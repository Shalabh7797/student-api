package com.student.api.repository;

import com.student.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // No extra code needed, JpaRepository provides all CRUD methods
}
