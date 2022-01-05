package com.example.Miltiple_cruds.Course.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Course.application.ports.DELETECoursePort;
import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETECourseController {

    @Autowired
    DELETECoursePort deleteCoursePort;

    @DeleteMapping("/course/{id}")
    public void deleteById(@PathVariable String id) throws NotFoundException {
        deleteCoursePort.deleteById(id);

    }


}




