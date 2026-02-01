package com.example.db.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Type;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentProfile
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    @Column(length = 100, nullable = false)
    String name;
    @Column(length = 3, nullable = false)
    int age;
    @Column( nullable = false)
    String email;
    @Column( nullable = false)
    String address;
    @Column( nullable = false)
    String password;
    @Column( nullable = false)
    String image;
}
