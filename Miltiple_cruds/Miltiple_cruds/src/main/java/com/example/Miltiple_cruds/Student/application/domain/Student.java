package com.example.Miltiple_cruds.Student.application.domain;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    @Column(name = "ID_STUDENT")
    private String id_student;

    @NotNull
    private String branch;
    @NotNull
    private String comments;
    @NotNull
    private int num_hours_week;

}
