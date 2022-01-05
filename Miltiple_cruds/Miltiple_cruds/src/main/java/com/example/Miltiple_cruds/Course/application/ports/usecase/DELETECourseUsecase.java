package com.example.Miltiple_cruds.Course.application.ports.usecase;

import com.example.Miltiple_cruds.Course.application.domain.CourseJPA;
import com.example.Miltiple_cruds.Course.application.ports.DELETECoursePort;
import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DELETECourseUsecase implements DELETECoursePort {

    @Autowired
    CourseJPA courseJPA;

    public void deleteById(String id) throws NotFoundException{
        if (courseJPA.findById(id).isPresent()) {
            courseJPA.deleteById(id);
        }
    }
}
