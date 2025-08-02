package com.HMA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HMA.models.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
} 