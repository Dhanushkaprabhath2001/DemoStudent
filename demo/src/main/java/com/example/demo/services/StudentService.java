package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepositorie;



@Service
public class StudentService {
    
    @Autowired
    private StudentRepositorie studentObj;

public List<Student> getAllStudent(){
    List<Student> students = studentObj.findAll();

    return students;
}
public Student addStudent(Student student1){
    return studentObj.save(student1);
}
}
