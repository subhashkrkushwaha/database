package com.example.db.repository;

import com.example.db.Entity.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentProfile,Long> {
}
