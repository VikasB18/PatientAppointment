package com.patientappointmentsystem.patientAppointment.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "appointment")
public class Appointment {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "doctor_id", nullable = false)
	    private Doctor doctor;
	    
	    @Column(name = "start_time", nullable = false)
	    private LocalDateTime startTime;
	    
	    public Appointment() {
	        // Default constructor
	    }

	    public Appointment(Doctor doctor, LocalDateTime startTime) {
	        this.doctor = doctor;
	        this.startTime = startTime;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Doctor getDoctor() {
	        return doctor;
	    }

	    public void setDoctor(Doctor doctor) {
	        this.doctor = doctor;
	    }

	    public LocalDateTime getStartTime() {
	        return startTime;
	    }

	    public void setStartTime(LocalDateTime startTime) {
	        this.startTime = startTime;
	    }

	    // toString, hashCode, equals methods (optional)
	    @Override
	    public String toString() {
	        return "Appointment{" +
	                "id=" + id +
	                ", doctor=" + doctor +
	                ", startTime=" + startTime +
	                '}';
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, doctor, startTime);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Appointment appointment = (Appointment) obj;
	        return Objects.equals(id, appointment.id) && Objects.equals(doctor, appointment.doctor) && Objects.equals(startTime, appointment.startTime);
	    }


}
