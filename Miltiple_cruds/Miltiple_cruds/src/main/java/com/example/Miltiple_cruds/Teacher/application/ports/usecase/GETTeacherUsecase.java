package com.example.Miltiple_cruds.Teacher.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import com.example.Miltiple_cruds.Teacher.application.domain.TeacherJPA;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;
import com.example.Miltiple_cruds.Teacher.application.ports.GETTeacherPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GETTeacherUsecase implements GETTeacherPort {
    @Autowired
    TeacherJPA teacherJPA;


    public TeacherOUTPUT getTeacherById(String id) throws Exception {
        Teacher teacher = teacherJPA.findById(id).orElseThrow(() -> new NotFoundException("No hay profesor"));

        return new TeacherOUTPUT(teacher);
    }



    public List<TeacherOUTPUT> getTeacherByName(String branch) throws Exception {
        if (teacherJPA.findByName(branch).isEmpty()) { throw  new NotFoundException("No hay profesor");}
        List<Teacher> teachers = teacherJPA.findByName(branch);

        return toListDTOoutput(teachers);
    }


    public List<TeacherOUTPUT> getAllTeachers() throws Exception {
        List<Teacher> teacher = teacherJPA.findAll();
        if(teacher.isEmpty()){ throw new NotFoundException("No hay profesor");}

        return toListDTOoutput(teacher);
    }


}
