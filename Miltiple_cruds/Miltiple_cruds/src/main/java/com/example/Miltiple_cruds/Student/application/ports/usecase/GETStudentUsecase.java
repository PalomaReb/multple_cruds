package com.example.Miltiple_cruds.Student.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.example.Miltiple_cruds.Student.application.domain.StudentJPA;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.StudentOUTPUT;
import com.example.Miltiple_cruds.Student.application.ports.GETStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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

    public StudentOUTPUT getStudentByid(String id, String type) throws Exception {
        Student student = studentJPA.findById(id).orElseThrow(() -> new NotFoundException("No existe estudiante con id:" + id));

        if (type.equalsIgnoreCase("full")){
            return new StudentOUTPUT(student);
        }

        return new StudentOUTPUT(student);
    }

    public List<StudentOUTPUT> getStudentsByName(String branch) throws Exception {

        if (studentJPA.findByBranch(branch).isEmpty()) { throw  new NotFoundException("No hay ningún estudiante con nombre: " + branch + ".");}
        List<Student> students = studentJPA.findByBranch(branch);

        return toListDTOoutput(students);
    }

}



