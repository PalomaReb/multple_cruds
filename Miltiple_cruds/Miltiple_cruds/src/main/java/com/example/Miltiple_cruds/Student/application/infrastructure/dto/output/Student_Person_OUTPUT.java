package com.example.Miltiple_cruds.Student.application.infrastructure.dto.output;

import com.example.Miltiple_cruds.Person.application.infrastructure.dto.output.PersonOUTPUT;
import com.example.Miltiple_cruds.Student.application.domain.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student_Person_OUTPUT extends StudentOUTPUT {

    PersonOUTPUT personOUTPUT;

    public Student_Person_OUTPUT (Student student){
        super(student);
        this.personOUTPUT = new PersonOUTPUT(student.getPerson());
    }
}
