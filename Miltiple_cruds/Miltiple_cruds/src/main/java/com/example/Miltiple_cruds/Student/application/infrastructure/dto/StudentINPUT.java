package com.example.Miltiple_cruds.Student.application.infrastructure.dto;

import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.example.Miltiple_cruds.Student.application.infrastructure.dto.output.StudentOUTPUT;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentINPUT {

    private StudentOUTPUT studentOUTPUT;
    private String branch;
    private String comments;
    private int num_hours_week;

    public Student toOutput(){
        Student student = new Student();

        student.setBranch(branch);
        student.setComments(comments);
        student.setNum_hours_week(num_hours_week);


        return student;
    }

}
