package com.example.Miltiple_cruds.Student.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentOUTPUT;
import com.example.Miltiple_cruds.Student.application.ports.GETStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetStudentController {

    @Autowired
    GETStudentPort getStudentPort;

    @GetMapping(value = "/students")
    public List<StudentOUTPUT> getAllStudents() throws Exception {
        //System.out.println("entrando a controlador");
        return getStudentPort.getAllStudents();

    }
}

