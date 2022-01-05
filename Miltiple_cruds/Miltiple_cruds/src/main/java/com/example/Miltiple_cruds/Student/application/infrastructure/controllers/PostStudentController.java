package com.example.Miltiple_cruds.Student.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentINPUT;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentOUTPUT;
import com.example.Miltiple_cruds.Student.application.ports.POSTStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostStudentController {

    @Autowired
    POSTStudentPort posTport;

    @PostMapping("/addStudent")
    public StudentOUTPUT addNewStudent(@RequestBody StudentINPUT studentINPUT)throws Exception{
        return posTport.addNewStudent(studentINPUT);
    }
}
