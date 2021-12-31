package com.example.Miltiple_cruds.Person.application.infrastructure.errors;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class Error {
    Date timestamp;
    int HTTPcode;
    String message;

    public Error NotFoundException(){
        this.timestamp = new Date();
        this.HTTPcode = 404;
        this.message = "this is a not found exception ";
        return this;
    }
    public Error UnprocesableExceptions(){
        this.timestamp = new Date();
        this.HTTPcode = 422;
        this.message = "this is a unprocesable exception";
        return this;
    }
}
