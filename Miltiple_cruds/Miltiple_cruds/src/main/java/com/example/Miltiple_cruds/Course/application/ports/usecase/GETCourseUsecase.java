package com.example.Miltiple_cruds.Course.application.ports.usecase;

import com.example.Miltiple_cruds.Course.application.domain.Course;
import com.example.Miltiple_cruds.Course.application.domain.CourseJPA;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseOUTPUT;
import com.example.Miltiple_cruds.Course.application.ports.GETCoursePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GETCourseUsecase implements GETCoursePort {

    @Autowired
    CourseJPA courseJPA;


  //  @Override
    public CourseOUTPUT getCourseById(String id) throws Exception {
        Course course = courseJPA.findById(id).orElseThrow(()-> new Exception("no hay id"));
        return new CourseOUTPUT(course) ;
    }

  /* @Override
    public List<CourseOUTPUT> toCourseOUTPUT(List<Course> course) {
        List <CourseOUTPUT> courseOUTPUTS = new ArrayList<>();

    }*/

    //@Override
    public List <Course> getCourseByName(String name) throws Exception {
    return courseJPA.findByName(name);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseJPA.findAll();
    }
}
