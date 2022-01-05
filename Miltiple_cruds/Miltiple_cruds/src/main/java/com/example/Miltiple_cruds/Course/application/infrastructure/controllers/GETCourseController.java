package com.example.Miltiple_cruds.Course.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Course.application.domain.Course;
import com.example.Miltiple_cruds.Course.application.infrastructure.dto.CourseOUTPUT;
import com.example.Miltiple_cruds.Course.application.ports.GETCoursePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GETCourseController {

    @Autowired
    GETCoursePort getCoursePort;

    @GetMapping(value ="/getcoursebyid/{id}")
    public CourseOUTPUT getCourseById(@PathVariable String id) throws Exception {
        return getCoursePort.getCourseById(id);
    }

    @GetMapping(value ="/getcoursebyname/{name}")
    public List<Course> getCourseByName(@PathVariable String name) throws Exception {
        return getCoursePort.getCourseByName(name);
    }

    @GetMapping(value ="/getallcourse")
    public List<Course> getAllCourses() throws Exception {
        return getCoursePort.getAllCourses();
    }}
