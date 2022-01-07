package com.example.Miltiple_cruds.Person.application.infrastructure.dto.output;

import com.example.Miltiple_cruds.Person.application.domain.Person;
import com.example.Miltiple_cruds.Teacher.application.infrastucture.dto.TeacherOUTPUT;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person_Teacher_OUTPUT extends  PersonOUTPUT{
    private TeacherOUTPUT teacherOUTPUT;

    public Person_Teacher_OUTPUT(Person person){
        this.teacherOUTPUT = new TeacherOUTPUT(person.getTeacher());
    }

}
