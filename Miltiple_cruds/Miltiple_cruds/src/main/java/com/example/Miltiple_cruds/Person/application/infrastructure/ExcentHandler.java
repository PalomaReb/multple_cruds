package com.example.Miltiple_cruds.Person.application.infrastructure;

import com.example.Miltiple_cruds.Person.application.domain.exceptions.NotFoundException;
import com.example.Miltiple_cruds.Person.application.domain.exceptions.UnprocesableExceptions;
import com.example.Miltiple_cruds.Person.application.infrastructure.errors.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExcentHandler {

    @Autowired
    Error error;

    @ExceptionHandler({NotFoundException.class})
    public Error notFound(){
        return error.NotFoundException();
    }

    @ExceptionHandler ({UnprocesableExceptions.class})
    public Error unprocExcep(){
        return error.UnprocesableExceptions();
    }
}
