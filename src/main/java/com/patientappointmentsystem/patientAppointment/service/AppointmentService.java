package com.patientappointmentsystem.patientAppointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientappointmentsystem.patientAppointment.model.Appointment;
import com.patientappointmentsystem.patientAppointment.repository.AppointmentRepository;


@Service
public class AppointmentService {
	
	 @Autowired
	    private AppointmentRepository appointmentRepository;

	    public List<Appointment> getAllAppointments() {
	        return appointmentRepository.findAll();
	    }

	    public Appointment getAppointmentById(Long id) {
	        return appointmentRepository.findById(id).orElse(null);
	    }

}
