package com.example.Miltiple_cruds.Student.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Student.application.domain.StudentJPA;
import com.example.Miltiple_cruds.Student.application.ports.DELETEStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DELETEStudentUsecase implements DELETEStudentPort {

    @Autowired
    StudentJPA studentJPA;


    public void deleteStudent(String id) throws Exception {
        if(studentJPA.findById(id).isEmpty()){throw new NotFoundException("No existe estudiante");}
        studentJPA.delete(studentJPA.findById(id).get());
    }
}
