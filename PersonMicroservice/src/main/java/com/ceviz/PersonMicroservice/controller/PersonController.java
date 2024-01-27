package com.ceviz.PersonMicroservice.controller;

import com.ceviz.PersonMicroservice.entity.Person;
import com.ceviz.PersonMicroservice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping
    ResponseEntity<Person> getPersonByIdNumber(@RequestParam String identificationNumber) {
        return new ResponseEntity<Person>(service.getPersonByIdNumber(identificationNumber), HttpStatus.OK);
    }
}
