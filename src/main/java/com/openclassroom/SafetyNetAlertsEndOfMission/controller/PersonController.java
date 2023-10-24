package com.openclassroom.SafetyNetAlertsEndOfMission.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.openclassroom.SafetyNetAlertsEndOfMission.repository.PersonRepository;

import com.openclassroom.SafetyNetAlertsEndOfMission.model.Person;






@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
/******************ancienne version*********************** */

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
        @GetMapping("/person") 
        public List<Person>persons() {
            return personRepository.findAll();
        }
 
/*  //Récupérer une personne
    @GetMapping("/person/{firstName}")
        public Person afficherUnePersonne(@PathVariable String firstName) {
        Person person = new Person(firstName, "Boyd", "1509 Culver St", "Culver", "97451", "841-874-6512", "jaboyd@email.com" ); 
        
        return person;}

        
            //modifier les attributs d'une personne
            @PutMapping(value ="/person/{firstName}")
            public void ajouterPerson(@RequestBody Person person) {
            PersonDAO.save(person);
        } 
        
    
    
    @GetMapping("/person")
    public Person getPerson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Person data = objectMapper.readValue(new File("C:\\Users\\o75se\\OneDrive\\Documents\\formation développeur Java\\P5\\application\\src\\main\\java\\com\\openclassroom\\application\\data\\data.json"), Person.class);
            
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/

}




    