package com.junfel.restapi.service;

import com.junfel.restapi.entity.Student;
import com.junfel.restapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void registerStudent(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Invalid name");
        }

        studentRepository.save(new Student(name, email));
    }
}
