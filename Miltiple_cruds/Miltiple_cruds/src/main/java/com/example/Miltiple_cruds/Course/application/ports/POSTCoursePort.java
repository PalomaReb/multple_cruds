package com.example.Miltiple_cruds.Course.application.ports;

import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseINPUT;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseOUTPUT;

public interface POSTCoursePort {

    CourseOUTPUT addCourse(CourseINPUT courseINPUT) throws Exception;;

}
