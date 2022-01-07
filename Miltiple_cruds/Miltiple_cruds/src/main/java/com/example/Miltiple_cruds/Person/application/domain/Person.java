package com.example.Miltiple_cruds.Person.application.domain;

import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.example.Miltiple_cruds.Teacher.application.domain.Teacher;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Getter
@Setter
@Table(name="Persona")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String usuario;
    private String password;
    private String name;
    private String lastName;
    private String comp_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String image_url;
    private Date term_Date;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_student")
    Student student;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_teacher")
    Teacher teacher;

}
