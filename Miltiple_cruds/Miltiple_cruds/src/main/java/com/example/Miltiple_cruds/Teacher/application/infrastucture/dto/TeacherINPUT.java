package com.example.Miltiple_cruds.Teacher.application.infrastucture.dto;


import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonINPUT;
import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeacherINPUT {

    private PersonINPUT personINPUT;

    private String branch;
    private String comments;

    public Teacher toOutput(){

        Teacher teacher = new Teacher();
        //teacher.set
        teacher.setComments(comments);
        teacher.setBranch(branch);
        return teacher;
    }
}
