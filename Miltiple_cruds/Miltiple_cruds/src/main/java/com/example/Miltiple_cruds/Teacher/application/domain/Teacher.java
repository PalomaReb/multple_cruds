package com.example.Miltiple_cruds.Teacher.application.domain;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Teacher {
    @Id
    @Column(name = "Teacher_id")
    private String id_teacher;

    @NotNull
    private String branch;
    @NotNull
    private String comments;

}
