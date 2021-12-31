package com.example.Miltiple_cruds.Person.application.ports.ports;


import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonINPUT;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonOUTPUT;

public interface POSTport {
    PersonOUTPUT addPerson (PersonINPUT person) throws Exception;

}

