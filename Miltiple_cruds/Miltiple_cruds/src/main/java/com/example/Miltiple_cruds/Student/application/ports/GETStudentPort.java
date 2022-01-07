package com.example.Miltiple_cruds.Student.application.ports;

import com.example.Miltiple_cruds.Student.application.infrastructure.dto.output.StudentOUTPUT;

import java.util.List;

public interface GETStudentPort {

    StudentOUTPUT getStudentByid(String id, String type) throws Exception;

    List <StudentOUTPUT> getAllStudents() throws Exception;

    List<StudentOUTPUT> getStudentsByName(String branch) throws Exception;

}
