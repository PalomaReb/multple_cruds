package com.example.Miltiple_cruds.Course.application.domain;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

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

}
