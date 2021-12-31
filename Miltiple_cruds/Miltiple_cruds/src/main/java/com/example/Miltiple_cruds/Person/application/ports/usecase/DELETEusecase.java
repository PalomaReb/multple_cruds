package com.example.Miltiple_cruds.Person.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.PersonJPA;
import com.example.Miltiple_cruds.Person.application.ports.ports.DELETEport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DELETEusecase implements DELETEport {

    @Autowired
    PersonJPA personJPA;

    public void deletePerson(int id) throws Exception {
        if(personJPA.findById(id).isEmpty()){throw new Exception("No se encuentra persona");}
        personJPA.delete(personJPA.findById(id).get());
    }
}
