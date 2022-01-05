package com.example.Miltiple_cruds.Course.application.ports;

import com.example.Miltiple_cruds.Course.application.domain.Course;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseOUTPUT;

import java.util.List;

public interface GETCoursePort {

    CourseOUTPUT getCourseById(String id) throws Exception;

   // List<CourseOUTPUT> toCourseOUTPUT(List<Course> course);

    List<Course> getCourseByName(String name) throws Exception;
    List<Course> getAllCourses();
}
