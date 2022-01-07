package com.example.Miltiple_cruds.Person.application.ports.ports;


import com.example.Miltiple_cruds.Person.application.infrastructure.dto.output.PersonOUTPUT;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GETport {

    PersonOUTPUT getPersonById(int id) throws Exception;
    List <PersonOUTPUT> findByName(String name) throws Exception;
    List<PersonOUTPUT> getAll() throws Exception;

}

