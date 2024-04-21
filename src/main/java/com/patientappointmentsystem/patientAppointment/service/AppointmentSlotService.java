package com.patientappointmentsystem.patientAppointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientappointmentsystem.patientAppointment.model.AppointmentSlot;
import com.patientappointmentsystem.patientAppointment.repository.AppointmentSlotRepository;
import com.patientappointmentsystem.patientAppointment.repository.DoctorRepository;


@Service
public class AppointmentSlotService {
	
	  @Autowired
	    private AppointmentSlotRepository appointmentSlotRepository;
	  
	 

	    public List<AppointmentSlot> getAllAppointmentSlots() {
	        return appointmentSlotRepository.findAll();
	    }

	    public AppointmentSlot getAppointmentSlotById(Long id) {
	        return appointmentSlotRepository.findById(id).orElse(null);
	    }
	    
	    

}
