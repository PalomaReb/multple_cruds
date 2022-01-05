package com.example.Miltiple_cruds.Course.application.infrastructure.dto;

import com.example.Miltiple_cruds.Course.application.domain.Course;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CourseOUTPUT {
    String id_course;
    private String name;
    private String comments;
    private Date initial_date;
    private Date finish_date;

    public CourseOUTPUT (Course course){
        this.id_course = course.getId_course();
        this.name = course.getName();
        this.comments = course.getComments();
        this.initial_date = course.getInitial_date();
        this.finish_date = course.getFinish_date();


    }
}
