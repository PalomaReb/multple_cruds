package com.example.Miltiple_cruds.Course.application.ports.usecase;


import com.example.Miltiple_cruds.Course.application.domain.Course;
import com.example.Miltiple_cruds.Course.application.domain.CourseJPA;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseINPUT;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseOUTPUT;
import com.example.Miltiple_cruds.Course.application.ports.POSTCoursePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POSTCourseUsecase implements POSTCoursePort {

    @Autowired
    CourseJPA courseJPA;

    @Override
    public CourseOUTPUT addCourse(CourseINPUT courseINPUT) throws Exception {
        Course course = courseJPA.saveAndFlush(courseINPUT.toOutput());
        return new CourseOUTPUT(course);

}
}