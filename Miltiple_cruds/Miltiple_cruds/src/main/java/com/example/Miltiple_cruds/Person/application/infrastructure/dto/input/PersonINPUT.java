package com.example.Miltiple_cruds.Person.application.infrastructure.dto.input;

import com.example.Miltiple_cruds.Person.application.domain.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PersonINPUT {
    private String usuario;
    private String password;
    private String name;
    private String lastName;
    private String comp_email;
    private String personal_email;
    private String city;
    private boolean active;
    private Date created_date;
    private String image_url;
    private Date term_date;

    public Person toOutput(PersonINPUT personINPUT){
        Person person = new Person();

        person.setUsuario(personINPUT.getUsuario());
        person.setPassword(personINPUT.getPassword());
        person.setName(personINPUT.getName());
        person.setLastName(personINPUT.getLastName());
        person.setComp_email(personINPUT.getComp_email());
        person.setPersonal_email(personINPUT.getPersonal_email());
        person.setCity(personINPUT.getCity());
        person.setActive(personINPUT.isActive());
        person.setCreated_date(personINPUT.getCreated_date());
        person.setImage_url(personINPUT.getImage_url());
        person.setTerm_Date(personINPUT.getTerm_date());

        return person;
    }



}
