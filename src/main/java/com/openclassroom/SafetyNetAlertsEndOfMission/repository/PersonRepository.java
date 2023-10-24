package com.openclassroom.SafetyNetAlertsEndOfMission.repository;

import org.slf4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.openclassroom.SafetyNetAlertsEndOfMission.model.Person;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Component
@Repository
public class PersonRepository {

    public List<Person> persons;
    private JsonReader jsonDataReader;

    public PersonRepository(JsonReader jsonDataReader) throws Exception {
        this.jsonDataReader = jsonDataReader;
        this.persons = this.jsonDataReader.getPersonsData();
    }

    public List<Person> findAll() {
        return this.persons;
    }

    public Person createPerson(Person p) {
    
    String createPersonUrl =  "www.localhost:8080/person";

    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<Person> request = new HttpEntity<Person>(p);
    ResponseEntity<Person> response = restTemplate.exchange(
        createPersonUrl,
        HttpMethod.POST,
        request,
        Person.class);

    //Logger.debug("Create Employee call " + response.getStatusCode().toString());

    return response.getBody();
}
}
