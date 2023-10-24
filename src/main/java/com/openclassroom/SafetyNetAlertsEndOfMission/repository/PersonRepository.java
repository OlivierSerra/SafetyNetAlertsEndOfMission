package com.openclassroom.SafetyNetAlertsEndOfMission.repository;

import org.springframework.stereotype.Repository;

import com.openclassroom.SafetyNetAlertsEndOfMission.model.Person;

import java.util.List;


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
}
