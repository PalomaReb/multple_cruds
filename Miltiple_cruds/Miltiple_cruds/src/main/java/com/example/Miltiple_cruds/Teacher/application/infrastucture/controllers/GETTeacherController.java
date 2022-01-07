package com.example.Miltiple_cruds.Teacher.application.infrastucture.controllers;

import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;
import com.example.Miltiple_cruds.Teacher.application.ports.GETTeacherPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GETTeacherController {

    @Autowired
    GETTeacherPort getTeacherPort;

    @GetMapping(value = "/getteacherbyid/{id}")
    public TeacherOUTPUT getTeacherById (@PathVariable String id) throws Exception {
        return getTeacherPort.getTeacherById(id);
    }

    @GetMapping(value = "/getteacherbyname/{name}")
    public List<TeacherOUTPUT> getByBranch (@PathVariable String branch) throws Exception {
        return getTeacherPort.getByBranch(branch);
    }

    @GetMapping(value = "/getallteachers")
    public List<TeacherOUTPUT> getAllTeachers () throws Exception {
        return getTeacherPort.getAllTeachers();
    }


}
