package com.example.Miltiple_cruds.Person.application.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocesableExceptions extends RuntimeException{
    public UnprocesableExceptions (String message){
        super(message);

        //error setters?
    }

}
