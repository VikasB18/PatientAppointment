package com.patientappointmentsystem.patientAppointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientappointmentsystem.patientAppointment.model.Appointment;
import com.patientappointmentsystem.patientAppointment.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	
	 @Autowired
	    private AppointmentService appointmentService;

	    @GetMapping
	    public List<Appointment> getAllAppointments() {
	        return appointmentService.getAllAppointments();
	    }

	    @GetMapping("/{id}")
	    public Appointment getAppointmentById(@PathVariable Long id) {
	        return appointmentService.getAppointmentById(id);
	    }

	
}
