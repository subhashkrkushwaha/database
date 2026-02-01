package com.example.db.controller;

import com.example.db.Entity.StudentProfile;
import com.example.db.service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentProfileController {

    @Autowired
    private StudentProfileService studentProfileService;
    //create new controller
    @PostMapping("/create-account")
    public ResponseEntity<StudentProfile> save(@RequestBody StudentProfile studentProfile) {
        StudentProfile saved = studentProfileService.save(studentProfile);
        return new ResponseEntity<>(saved,HttpStatus.CREATED);
    }
    @GetMapping("/get-all")
    public ResponseEntity<List<StudentProfile>> getAllStudentProfile() {
        List<StudentProfile> getAllStudent = studentProfileService.findAllStudent();
        return new ResponseEntity<>(getAllStudent,HttpStatus.CREATED);
    }
}
