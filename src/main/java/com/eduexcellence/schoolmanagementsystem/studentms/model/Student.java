package com.eduexcellence.schoolmanagementsystem.studentms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String nationalId;
    private String fatherName;
    private String fatherPhone;
    private String motherName;
    private String motherPhone;
    
    @Column(unique = true)
    private String studentId;

    private Long classroomId;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}


