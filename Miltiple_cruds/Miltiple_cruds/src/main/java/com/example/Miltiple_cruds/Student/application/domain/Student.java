package com.example.Miltiple_cruds.Student.application.domain;


import com.example.Miltiple_cruds.Course.application.domain.Course;
import com.example.Miltiple_cruds.Person.application.domain.Person;
import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

     @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
     private List <Course> courses = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_person")
    private Person person;

}
