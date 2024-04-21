package com.patientappointmentsystem.patientAppointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientappointmentsystem.patientAppointment.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	

}