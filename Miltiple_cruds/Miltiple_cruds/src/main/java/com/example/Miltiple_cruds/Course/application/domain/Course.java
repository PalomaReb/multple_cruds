package com.example.Miltiple_cruds.Course.application.domain;

import com.example.Miltiple_cruds.Student.application.domain.Student;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Course {

    @Id
    @Column(name = "course_id")
    private String id_course;

    @NotNull
    private String name;
    @NotNull
    private String comments;

    @NotNull
    private Date initial_date;

    @NotNull
    private Date finish_date;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student")
    private List <Student> students;

}
