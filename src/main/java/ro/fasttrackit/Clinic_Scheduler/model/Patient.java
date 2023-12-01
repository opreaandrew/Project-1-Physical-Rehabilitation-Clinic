package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private int age;
    private Sex sex;
    private String emergencyContact;

    // Link to Visit, somehow
    private String medicalHistory;

}