package com.example.Miltiple_cruds.Person.application.infrastructure.dto.output;


import com.example.Miltiple_cruds.Person.application.domain.Person;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.output.StudentOUTPUT;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person_Student_OUTPUT extends PersonOUTPUT {
    private StudentOUTPUT studentOUTPUT;

    public Person_Student_OUTPUT (Person person){
            this.studentOUTPUT = new StudentOUTPUT(person.getStudent());
    }

}
