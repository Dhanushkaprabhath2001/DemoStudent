package com.example.demo.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentServiceObj;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
      return new ResponseEntity<>(studentServiceObj.getAllStudent(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@Valid Student studentData, BindingResult bindingResult,@RequestBody Student student1){
        // if(bindingResult.hasErrors()){
        //     return new ResponseEntity<>("Invalid Data",HttpStatus.BAD_REQUEST);
        // }else{
            return new ResponseEntity<>(studentServiceObj.addStudent(student1),HttpStatus.OK);
        // }
      
    }
    
}
