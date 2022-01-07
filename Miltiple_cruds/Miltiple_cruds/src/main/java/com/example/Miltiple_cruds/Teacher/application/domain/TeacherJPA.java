package com.example.Miltiple_cruds.Teacher.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherJPA extends JpaRepository <Teacher, String>{
List<Teacher> findByBranch(String branch);
}
