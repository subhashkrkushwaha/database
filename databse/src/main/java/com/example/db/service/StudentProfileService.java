package com.example.db.service;

import com.example.db.Entity.StudentProfile;
import com.example.db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentProfileService {

    @Autowired
    private StudentRepository studentRepository;

    //create new profile
    public StudentProfile save(StudentProfile studentProfile) {
        return studentRepository.save(studentProfile);
    }


    @GetMapping("/get-all")
    public List<StudentProfile> findAllStudent() {
        return studentRepository.findAll();
    }
}
