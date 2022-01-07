package com.example.Miltiple_cruds.Student.application.infrastructure.dto.output;


import com.example.Miltiple_cruds.Student.application.domain.Student;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentOUTPUT {
    private String branch;
    private String comments;
    private int num_hours_week;


    public StudentOUTPUT (Student student){
        this.branch = student.getBranch();
        this.comments = student.getComments();
        this.num_hours_week = student.getNum_hours_week();
    }


}
