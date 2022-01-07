package com.example.Miltiple_cruds.Teacher.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Teacher.application.domain.TeacherJPA;
import com.example.Miltiple_cruds.Teacher.application.ports.DELETETeacherPort;
import com.example.Miltiple_cruds.Teacher.application.ports.GETTeacherPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DELETETeacherUsecase implements DELETETeacherPort {

    @Autowired
    TeacherJPA teacherJPA;

    public void deleteTeacher(String id) throws Exception {
        if(teacherJPA.findById(id).isEmpty()){throw new NotFoundException("No existe profesor con id:" + id);}
        teacherJPA.delete(teacherJPA.findById(id).get());
    }

}
