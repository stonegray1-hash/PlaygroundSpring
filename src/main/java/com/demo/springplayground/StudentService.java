package com.demo.springplayground;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {


    public Student getStudent() {
        return new Student("John Doe", 20, "A diligent student.");
    }

    public List<Student> getAllStudents() {
        return List.of(
                new Student("John Doe", 20, "A diligent student."),
                new Student("Jane Smith", 22, "An excellent student."),
                new Student("Alice Johnson", 19, "A bright student.")
        );
    }
}
