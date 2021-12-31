package com.example.Miltiple_cruds.Person.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Person.application.ports.ports.DELETEport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETEPersoncontroller {

        @Autowired
        DELETEport deletEport;

        @DeleteMapping("/delete/{id}")
        public void deleteID (@PathVariable int id) throws Exception{
            deletEport.deletePerson(id);
        }
    }

