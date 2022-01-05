package com.example.Miltiple_cruds.Course.application.ports;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;

public interface DELETECoursePort {

    public void deleteById(String id) throws NotFoundException;

}
