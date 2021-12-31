package com.example.Miltiple_cruds.Person.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.Person;
import com.example.Miltiple_cruds.Person.application.domain.PersonJPA;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GETusecase {
    @Autowired
    PersonJPA personJPA;


    //@Override
    public PersonOUTPUT getPersonById(int id) throws Exception {
        Person person = (Person) personJPA.findById(id).orElseThrow();
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();
        return personOUTPUT.changeDTO(person);

    }

    //@Override
    public List<PersonOUTPUT> findByName(String name) throws Exception {
        List <Person> person = personJPA.findByName(name);
        return toListDTOoutput(person);
    }

    List<PersonOUTPUT> toListDTOoutput(List<Person> person){
        List<PersonOUTPUT> personasDTO = new ArrayList();

        PersonOUTPUT personList = new PersonOUTPUT();

        for(Person persons: person){
            personasDTO.add(personList.changeDTO(persons));
        }
        return personasDTO;
    }

   // @Override
    public List<PersonOUTPUT> getAll() throws Exception {
        List<Person> personas = personJPA.findAll();

        return toListDTOoutput(personas);

    }
}
