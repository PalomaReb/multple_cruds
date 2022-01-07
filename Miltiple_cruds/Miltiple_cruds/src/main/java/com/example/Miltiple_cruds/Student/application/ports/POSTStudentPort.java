package com.example.Miltiple_cruds.Student.application.ports;

import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentINPUT;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.output.StudentOUTPUT;

public interface POSTStudentPort {

    StudentOUTPUT addNewStudent(StudentINPUT studentINPUT)throws Exception;
}
