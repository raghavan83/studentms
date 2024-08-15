package com.eduexcellence.schoolmanagementsystem.studentms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduexcellence.schoolmanagementsystem.studentms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentId(String studentId);
}
