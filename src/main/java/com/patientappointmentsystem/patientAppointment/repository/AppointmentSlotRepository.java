package com.patientappointmentsystem.patientAppointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientappointmentsystem.patientAppointment.model.AppointmentSlot;

public interface AppointmentSlotRepository  extends JpaRepository<AppointmentSlot, Long>{

}
