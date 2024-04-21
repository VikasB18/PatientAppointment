package com.patientappointmentsystem.patientAppointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientappointmentsystem.patientAppointment.model.Doctor;
import com.patientappointmentsystem.patientAppointment.repository.DoctorRepository;


@Service
public class DoctorService {
	
	 @Autowired
	    private DoctorRepository doctorRepository;

	    public List<Doctor> getAllDoctors() {
	        return doctorRepository.findAll();
	    }

	    public Doctor getDoctorById(Long id) {
	        return doctorRepository.findById(id).orElse(null);
	    }
	    
	    

}
