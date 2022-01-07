package com.example.Miltiple_cruds.Student.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Student.application.infrastructure.dto.output.StudentOUTPUT;
import com.example.Miltiple_cruds.Student.application.ports.GETStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getstudentid/{id}")
    public StudentOUTPUT getStudentByid(@PathVariable String id, @RequestParam(value = "outputType", defaultValue = "simple") String typeOfValue) throws Exception {
        return getStudentPort.getStudentByid(id, typeOfValue);
    }

    @GetMapping(value ="/getstudentbyname/{name}")
    public List<StudentOUTPUT> getStudentByName(@PathVariable String name) throws Exception {
        return getStudentPort.getStudentsByName(name);
    }
}