package com.openclassroom.SafetyNetAlertsEndOfMission.model;

import lombok.*;
import java.util.List;

/**
 * Medical Record class creates objects containing common properties
 * with Person objects (firstname, lastname)
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicalReport {
    private String firstName;
    private String lastName;
    private String birthdate;
    private List<String> medications;
    private List<String> allergies;

}
