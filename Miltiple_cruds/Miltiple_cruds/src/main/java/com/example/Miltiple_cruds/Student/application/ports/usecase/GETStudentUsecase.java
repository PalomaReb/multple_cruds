package com.example.Miltiple_cruds.Student.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.example.Miltiple_cruds.Student.application.domain.StudentJPA;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentOUTPUT;
import com.example.Miltiple_cruds.Student.application.ports.GETStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GETStudentUsecase implements GETStudentPort {

    @Autowired
    StudentJPA studentJPA;

    public List<StudentOUTPUT> getAllStudents() throws Exception {
        List<Student> students = studentJPA.findAll();
        if(students.isEmpty()){ throw new NotFoundException("No hay estudiantes.");}

        return toListDTOoutput(students);
    }

    public List<StudentOUTPUT> toListDTOoutput(List<Student> students) {
        List<StudentOUTPUT> studentDTOoutputs = new ArrayList();

        for(Student s: students){
            studentDTOoutputs.add(new StudentOUTPUT(s));
        }

        return studentDTOoutputs;
    }


}
