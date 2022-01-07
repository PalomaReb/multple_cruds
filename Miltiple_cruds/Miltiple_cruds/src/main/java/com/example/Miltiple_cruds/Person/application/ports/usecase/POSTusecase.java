package com.example.Miltiple_cruds.Person.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.PersonJPA;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.input.PersonINPUT;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.output.PersonOUTPUT;
import com.example.Miltiple_cruds.Person.application.ports.ports.POSTport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POSTusecase implements POSTport {

    @Autowired
    PersonJPA personJPA;


   // @Override
    public PersonOUTPUT addPerson(PersonINPUT person) throws Exception {
        if(person == null){throw new Exception("Persona mandada vacia");}
        if(person.getName().length() <6  && person.getName().length()>10){throw new Exception("nombre tiene que estar entre 6 y 10 characteres");}
        personJPA.saveAndFlush(person.toOutput(person));
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();
        return personOUTPUT.changeDTO(person.toOutput(person));
    }
}
