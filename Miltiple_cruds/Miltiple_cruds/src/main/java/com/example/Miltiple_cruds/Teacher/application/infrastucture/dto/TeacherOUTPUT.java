package com.example.Miltiple_cruds.Teacher.application.infrastucture.dto;


import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TeacherOUTPUT {
    private String id_teacher;
    private String comments;
    private String branch;

    public TeacherOUTPUT(Teacher teacher){
        this.id_teacher = teacher.getId_teacher();
        this.comments = teacher.getComments();
        this.branch = teacher.getBranch();
    }

}
