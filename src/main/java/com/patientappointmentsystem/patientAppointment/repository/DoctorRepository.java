package com.patientappointmentsystem.patientAppointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientappointmentsystem.patientAppointment.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
	

}
