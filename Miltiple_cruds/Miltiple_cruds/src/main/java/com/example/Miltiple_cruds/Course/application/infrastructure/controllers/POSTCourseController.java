package com.example.Miltiple_cruds.Course.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseINPUT;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseOUTPUT;
import com.example.Miltiple_cruds.Course.application.ports.POSTCoursePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSTCourseController {

    @Autowired
    POSTCoursePort postCoursePort;

    @PostMapping(value = "/addcourse")
    public CourseOUTPUT addCourse(@RequestBody CourseINPUT courseINPUT) throws Exception {
        return postCoursePort.addCourse(courseINPUT);
    }
}
