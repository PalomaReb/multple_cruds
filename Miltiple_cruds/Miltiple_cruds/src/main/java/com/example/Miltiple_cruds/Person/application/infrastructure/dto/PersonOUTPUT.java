package com.example.Miltiple_cruds.Person.application.infrastructure.dto;

import com.example.Miltiple_cruds.Person.application.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonOUTPUT {

    private String usuario;
    private String password;
    private String name;
    private String lastName;
    private String comp_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String image_url;
    private Date term_date;


    public PersonOUTPUT changeDTO(Person person){
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();

        personOUTPUT.setUsuario(person.getUsuario());
        personOUTPUT.setPassword(person.getPassword());
        personOUTPUT.setName(person.getName());
        personOUTPUT.setLastName(person.getLastName());
        personOUTPUT.setComp_email(person.getComp_email());
        personOUTPUT.setPersonal_email(person.getPersonal_email());
        personOUTPUT.setCity(person.getCity());
        personOUTPUT.setActive(person.getActive());
        personOUTPUT.setCreated_date(person.getCreated_date());
        personOUTPUT.setImage_url(person.getImage_url());
        personOUTPUT.setTerm_date(person.getTerm_Date());

        return personOUTPUT;
    }




}
