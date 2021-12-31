package com.example.Miltiple_cruds.Person.application.infrastructure.controllers;

import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonINPUT;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonOUTPUT;
import com.example.Miltiple_cruds.Person.application.ports.ports.POSTport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class POSTPersonController {

    @Autowired
    POSTport posTport;

    @PostMapping("addPerson")
    public PersonOUTPUT addNewPerson (@RequestBody PersonINPUT personINPUT)throws Exception{
        return posTport.addPerson(personINPUT);
    }

}
