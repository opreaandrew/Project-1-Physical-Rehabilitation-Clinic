package ro.fasttrackit.Clinic_Scheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Clinic_Scheduler.model.Doctor;
import ro.fasttrackit.Clinic_Scheduler.model.Visit;
import ro.fasttrackit.Clinic_Scheduler.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("/{id}/schedule")
    List<Visit> getDoctorSchedule(@PathVariable long id) {
        return doctorService.getDoctorSchedule(id);
    }

    @PostMapping("/{id}/schedule")
    Visit addDoctorSchedule(@PathVariable long id, @RequestBody Visit newSchedule) {
        return doctorService.addDoctorSchedule(id, newSchedule);
    }

    @GetMapping
    List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }
    @GetMapping("{id}")
    Doctor getSpecificDoctor(@PathVariable Long id){
        return doctorService.getDoctor(id);
    }

    @PostMapping
    Doctor newDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @PatchMapping("{id}")
    Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor){
        return doctorService.updateDoctor(id, doctor);
    }

    @DeleteMapping("{id}")
    Doctor fireDoctor(@PathVariable Long id){
        return doctorService.fireDoctor(id);
    }
}
