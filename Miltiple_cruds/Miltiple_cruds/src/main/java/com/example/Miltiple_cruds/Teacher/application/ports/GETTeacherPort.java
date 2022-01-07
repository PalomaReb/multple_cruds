package com.example.Miltiple_cruds.Teacher.application.ports;

import com.example.Miltiple_cruds.Course.application.domain.Course;
import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;

import java.util.List;

public interface GETTeacherPort {

    TeacherOUTPUT getTeacherById(String id) throws Exception;

    List<TeacherOUTPUT> toListDTOoutput(List<Teacher> teachers);

    List<TeacherOUTPUT> getByBranch(String branch) throws Exception;

    List<TeacherOUTPUT> getAllTeachers() throws Exception;
}
