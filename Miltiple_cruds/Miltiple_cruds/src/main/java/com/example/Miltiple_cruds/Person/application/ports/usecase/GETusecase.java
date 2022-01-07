package com.example.Miltiple_cruds.Person.application.ports.usecase;

import com.example.Miltiple_cruds.Person.application.domain.Person;
import com.example.Miltiple_cruds.Person.application.domain.PersonJPA;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.output.PersonOUTPUT;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.output.Person_Student_OUTPUT;
import com.example.Miltiple_cruds.Person.application.infrastructure.dto.output.Person_Teacher_OUTPUT;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GETusecase {
    @Autowired
    PersonJPA personJPA;



    public PersonOUTPUT getPersonById(int id) throws Exception {
        Person person = (Person) personJPA.findById(id).orElseThrow();
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();
        return personOUTPUT.changeDTO(person);

    }


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


    public List<PersonOUTPUT> getAll() throws Exception {
        List<Person> personas = personJPA.findAll();

        return toListDTOoutput(personas);

    }
    private PersonOUTPUT OutputType(Person person, String type){


        if(type.equalsIgnoreCase("simple")){return new PersonOUTPUT(person);}

        Person_Student_OUTPUT person_student_output = new Person_Student_OUTPUT(person);
        Person_Teacher_OUTPUT person_teacher_output = new Person_Teacher_OUTPUT(person);

        if(type.equalsIgnoreCase("full") && person_student_output.getStudentOUTPUT() != null){
            return person_student_output;
        }
        if(type.equalsIgnoreCase("full") && person_teacher_output.getTeacherOUTPUT() != null){
            return person_teacher_output;
        }

        return new PersonOUTPUT(person);
    }
    }


