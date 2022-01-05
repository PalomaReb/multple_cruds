package com.example.Miltiple_cruds.Course.application.infrastructure.dto;


import com.example.Miltiple_cruds.Course.application.domain.Course;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CourseINPUT {

    private String name;
    private String comments;
    private Date initial_date;
    private Date finish_date;

    public Course toOutput(){
        Course course = new Course();

        course.setName(name);
        course.setComments(comments);
        course.setInitial_date(initial_date);
        course.setFinish_date(finish_date);

        return course;
    }


}
