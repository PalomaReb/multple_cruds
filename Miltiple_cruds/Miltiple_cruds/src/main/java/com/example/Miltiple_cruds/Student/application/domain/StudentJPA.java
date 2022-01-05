package com.example.Miltiple_cruds.Student.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentJPA extends JpaRepository <Student, String> {
    List<Student> findByBranch(String branch);
}
