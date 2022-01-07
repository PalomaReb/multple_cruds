package com.example.Miltiple_cruds.Teacher.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import com.example.Miltiple_cruds.Teacher.application.domain.TeacherJPA;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;
import com.example.Miltiple_cruds.Teacher.application.ports.GETTeacherPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GETTeacherUsecase implements GETTeacherPort {
    @Autowired
    TeacherJPA teacherJPA;

    public List<TeacherOUTPUT> toListDTOoutput(List<Teacher> teachers) {
        List<TeacherOUTPUT> teachersDto = new ArrayList();

        for(Teacher p: teachers){
            teachersDto.add(new TeacherOUTPUT(p));
        }
        return teachersDto;
    }


    public TeacherOUTPUT getTeacherById(String id) throws Exception {
        Teacher profesor = teacherJPA.findById(id).orElseThrow(() -> new NotFoundException("No existe profesor con id:" + id));

        return new TeacherOUTPUT(profesor);
    }

    public List<TeacherOUTPUT> getByBranch(String branch) throws Exception {
        if (teacherJPA.findByBranch(branch).isEmpty()) { throw  new NotFoundException("No hay ningún profesor");}
        List<Teacher> teachers = teacherJPA.findByBranch(branch);

        return toListDTOoutput(teachers);
    }

    public List<TeacherOUTPUT> getAllTeachers() throws Exception {
        List<Teacher> teachers = teacherJPA.findAll();
        if(teachers.isEmpty()){ throw new NotFoundException("No hay profesores.");}

        return toListDTOoutput(teachers);
    }


}
