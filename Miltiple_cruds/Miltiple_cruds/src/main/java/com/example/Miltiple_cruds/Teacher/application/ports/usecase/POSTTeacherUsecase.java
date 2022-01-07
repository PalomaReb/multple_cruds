package com.example.Miltiple_cruds.Teacher.application.ports.usecase;

import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import com.example.Miltiple_cruds.Teacher.application.domain.TeacherJPA;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherINPUT;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;
import com.example.Miltiple_cruds.Teacher.application.ports.POSTTeacherPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POSTTeacherUsecase implements POSTTeacherPort {

    @Autowired
    TeacherJPA teacherJPA;

    public TeacherOUTPUT addTeacher(TeacherINPUT teacherINPUT) throws Exception {
        if(teacherINPUT == null){throw new Exception("Profesor enviado no existe");}
        Teacher teacher = teacherINPUT.toOutput();
        teacherJPA.saveAndFlush(teacher);
        return new TeacherOUTPUT(teacher);
    }
}
