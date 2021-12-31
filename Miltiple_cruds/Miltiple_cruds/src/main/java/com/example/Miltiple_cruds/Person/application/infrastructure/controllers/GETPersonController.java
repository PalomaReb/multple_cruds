package com.example.Miltiple_cruds.Person.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonOUTPUT;
import com.example.Miltiple_cruds.Person.application.ports.ports.GETport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class GETPersonController {
    @Autowired
    GETport geTport;

    @GetMapping("/id/{id}")
    public PersonOUTPUT getPersonById (@PathVariable int id) throws Exception{
        return geTport.getPersonById(id);
    }

    @GetMapping("/name/{name}")
    public List<PersonOUTPUT> personName (@PathVariable String name) throws Exception{
        return geTport.findByName(name);
    }

    @GetMapping("/allPerson")
    public List <PersonOUTPUT> getAll() throws Exception {
        return geTport.getAll();
    }

}
