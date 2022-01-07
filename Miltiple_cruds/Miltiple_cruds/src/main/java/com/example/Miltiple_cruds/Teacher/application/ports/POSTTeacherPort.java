package com.example.Miltiple_cruds.Teacher.application.ports;

import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherINPUT;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;

public interface POSTTeacherPort {

    TeacherOUTPUT addTeacher(TeacherINPUT teacherINPUT) throws Exception;


}
