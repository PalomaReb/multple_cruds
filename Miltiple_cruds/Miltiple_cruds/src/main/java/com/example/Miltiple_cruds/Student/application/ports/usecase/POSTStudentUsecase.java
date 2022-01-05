package com.example.Miltiple_cruds.Student.application.ports.usecase;

import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.example.Miltiple_cruds.Student.application.domain.StudentJPA;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentINPUT;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentOUTPUT;
import com.example.Miltiple_cruds.Student.application.ports.POSTStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POSTStudentUsecase implements POSTStudentPort {
    @Autowired
    StudentJPA studentJPA;

    @Override
    public StudentOUTPUT addNewStudent(StudentINPUT studentINPUT) throws Exception {
        if (studentINPUT == null) {
            throw new Exception("estudiante no existe");}
            Student student = studentINPUT.toOutput();
            studentJPA.saveAndFlush(student);
            return new StudentOUTPUT(student);
        }
    }
