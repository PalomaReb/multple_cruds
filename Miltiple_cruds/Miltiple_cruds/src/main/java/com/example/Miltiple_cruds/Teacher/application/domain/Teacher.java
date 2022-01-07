package com.example.Miltiple_cruds.Teacher.application.domain;


import com.example.Miltiple_cruds.Person.application.domain.Person;
import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_person")
    private Person person;

    @OneToMany(cascade = CascadeType.ALL)
    List <Student> students;

}
