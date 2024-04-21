package com.patientappointmentsystem.patientAppointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientappointmentsystem.patientAppointment.model.Doctor;
import com.patientappointmentsystem.patientAppointment.service.DoctorService;


@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	 @Autowired
	    private DoctorService doctorService;

	    @GetMapping
	    public List<Doctor> getAllDoctors() {
	        return doctorService.getAllDoctors();
	    }

	    @GetMapping("/{id}")
	    public Doctor getDoctorById(@PathVariable Long id) {
	        return doctorService.getDoctorById(id);
	    }

}
