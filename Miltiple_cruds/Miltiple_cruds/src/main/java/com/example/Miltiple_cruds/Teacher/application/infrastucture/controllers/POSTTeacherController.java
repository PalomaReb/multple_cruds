package com.example.Miltiple_cruds.Teacher.application.infrastucture.controllers;

import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherINPUT;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;
import com.example.Miltiple_cruds.Teacher.application.ports.POSTTeacherPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSTTeacherController {

    @Autowired
    POSTTeacherPort postTeacherPort;

    @PostMapping(value = "/addteacher")
    public TeacherOUTPUT addTeacher(@RequestBody TeacherINPUT teacherINPUT) throws Exception {
        return postTeacherPort.addTeacher(teacherINPUT);
    }
}