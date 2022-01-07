package com.example.Miltiple_cruds.Teacher.application.infrastucture.controllers;

import com.example.Miltiple_cruds.Teacher.application.ports.DELETETeacherPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETETeacherController {

    @Autowired
    DELETETeacherPort deleteTeacherPort;


    @DeleteMapping("/deleteteacher/{id}")
    public void deleteTeacher(@PathVariable String id) throws Exception {
        deleteTeacherPort.deleteTeacher(id);
    }
}