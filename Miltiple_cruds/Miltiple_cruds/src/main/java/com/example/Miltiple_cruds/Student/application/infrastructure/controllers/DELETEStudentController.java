package com.example.Miltiple_cruds.Student.application.infrastructure.controllers;


import com.example.Miltiple_cruds.Student.application.ports.DELETEStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETEStudentController {

    @Autowired
    DELETEStudentPort deleteStudentPort;

    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudent(@PathVariable String id) throws Exception {
        deleteStudentPort.deleteStudent(id);
    }
}
