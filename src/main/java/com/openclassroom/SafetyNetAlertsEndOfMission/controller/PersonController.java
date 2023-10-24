package com.openclassroom.SafetyNetAlertsEndOfMission.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openclassroom.SafetyNetAlertsEndOfMission.repository.PersonRepository;

import com.openclassroom.SafetyNetAlertsEndOfMission.model.Person;






@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
        @GetMapping("/person") 
        public List<Person>persons() {
            return personRepository.findAll();
        }
 

@PostMapping("/person")
    public String addPerson(@RequestBody Person person) {
        String message = "Personne ajoutée : " + person.getFirstName() + " " 
                                                + person.getLastName() + " " 
                                                + person.getAddress()  + " "
                                                + person.getCity() + " "
                                                + person.getZip() + " "
                                                + person.getPhone() + " "
                                                + person.getEmail();
        return message;

    }

}




    