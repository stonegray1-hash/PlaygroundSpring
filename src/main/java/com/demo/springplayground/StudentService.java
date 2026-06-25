package com.demo.springplayground;

@Service
public class StudentService {


    public Student getStudent() {
        return new Student("John Doe", 20, "A diligent student.");
    }

}
