package com.patientappointmentsystem.patientAppointment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientappointmentsystem.patientAppointment.model.AppointmentSlot;
import com.patientappointmentsystem.patientAppointment.service.AppointmentSlotService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/appointment-slots")
public class AppointmentSlotController {
	@Autowired
    private AppointmentSlotService appointmentSlotService;

    @GetMapping
    public List<AppointmentSlot> getAllAppointmentSlots() {
        return appointmentSlotService.getAllAppointmentSlots();
    }

    @GetMapping("/{id}")
    public AppointmentSlot getAppointmentSlotById(@PathVariable Long id) {
        return appointmentSlotService.getAppointmentSlotById(id);
    }
    
    
	

}
