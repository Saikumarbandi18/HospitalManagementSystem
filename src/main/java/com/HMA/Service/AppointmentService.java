package com.HMA.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMA.Repository.AppointmentRepository;
import com.HMA.models.Appointment;
import com.HMA.models.Patient;

@Service
public class AppointmentService {
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	public List<Appointment> getAllAppointments(){
		try {
			logger.info("Fetching all Appointments from database");
			return appointmentRepository.findAll();
		}catch(Exception e) {
			logger.error("An error occurred while fetching all patients: {}", e.getMessage());
			return null;
		}
	}
	
	public Appointment getAppointmentById(Long id) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all appoinment by id: {}", e.getMessage());
			return null;
		}
	}
	public Appointment createAppointment(Appointment appointment) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all appoinment by id: {}", e.getMessage());
			return null;
		}

	}
	
	
	public void deleteAppointment(Long id) {
		try {
			
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all appoinment by id: {}", e.getMessage());
		}

		
	}
	
	public Appointment updateAppointment(Long id) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all appoinment by id: {}", e.getMessage());
			return null;
		}
	}

}
