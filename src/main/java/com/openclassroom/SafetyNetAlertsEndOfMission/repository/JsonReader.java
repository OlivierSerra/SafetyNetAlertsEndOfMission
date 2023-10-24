package com.openclassroom.SafetyNetAlertsEndOfMission.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.openclassroom.SafetyNetAlertsEndOfMission.model.Content;
import com.openclassroom.SafetyNetAlertsEndOfMission.model.Firestation;
import com.openclassroom.SafetyNetAlertsEndOfMission.model.MedicalReport;
import com.openclassroom.SafetyNetAlertsEndOfMission.model.Person;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JsonReader {
    
    List<Person> persons = new ArrayList<>();
    List<Firestation> firestations = new ArrayList<>();
    List<MedicalReport> medicalRecords = new ArrayList<>();
    String filePath = "src/main/resources/data.json";

    Content content;

    public JsonReader(){
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File(this.filePath);
        try{
            content = objectMapper.readValue(jsonFile, Content.class);
            this.persons = this.content.getPersons();
            this.firestations = this.content.getFirestations();
            this.medicalRecords = this.content.getMedicalrecords();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getPersonsData(){
        return this.persons;
    }

    public List<Firestation> getFirestationsData() {
        return this.firestations;
    }

    public List<MedicalReport> getMedicalRecordsData() {
        return this.medicalRecords;
    }

}
