package com.example.Miltiple_cruds.Course.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseJPA extends JpaRepository <Course, String>{
    List <Course> findByName(String name);
}
