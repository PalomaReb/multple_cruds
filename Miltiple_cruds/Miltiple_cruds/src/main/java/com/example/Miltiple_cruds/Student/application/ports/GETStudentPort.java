package com.example.Miltiple_cruds.Student.application.ports;

import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentOUTPUT;

import java.util.List;

public interface GETStudentPort {

    List <StudentOUTPUT> getAllStudents() throws Exception;
}
