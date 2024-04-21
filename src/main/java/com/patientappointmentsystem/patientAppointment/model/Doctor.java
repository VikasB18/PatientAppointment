package com.patientappointmentsystem.patientAppointment.model;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "doctor")
public class Doctor {
	
	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Doctor doctor = (Doctor) obj;
        return Objects.equals(id, doctor.id) && Objects.equals(name, doctor.name);
    }


	public List<AppointmentSlot> getAppointmentSlots() {
		return appointmentSlots;
	}

	public void setAppointmentSlots(List<AppointmentSlot> appointmentSlots) {
		this.appointmentSlots = appointmentSlots;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	    @Column(name = "name", nullable = false)
	    private String name;

	    @OneToMany(mappedBy = "doctor")
	    private List<AppointmentSlot> appointmentSlots;
	    
	    @ElementCollection
	    @CollectionTable(name = "doctor_schedule", joinColumns = @JoinColumn(name = "doctor_id"))
	    @MapKeyColumn(name = "day_of_week")
	    @Column(name = "working_hours")
	    private Map<DayOfWeek, WorkingHours> schedule;


}
