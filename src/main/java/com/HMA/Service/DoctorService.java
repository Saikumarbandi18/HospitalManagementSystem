package com.HMA.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMA.Repository.DoctorRepository;
import com.HMA.models.Appointment;
import com.HMA.models.Doctor;

@Service
public class DoctorService {
	
	private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
	
	@Autowired
	private DoctorRepository doctorRepository;
	public List<Doctor> getAllDoctors(){
		try {
			logger.info("Fetching all doctors from database");
			return doctorRepository.findAll();
		}catch(Exception e) {
			logger.error("An error occurred while fetching all doctors: {}", e.getMessage());
			return null;
		}
	}
	
	public Doctor getDoctorById(Long id) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all doctors: {}", e.getMessage());
			return null;
		}
	}
	public Doctor createDoctor(Doctor doctor) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all doctors: {}", e.getMessage());
			return null;
		}

	}
	
	
	public void deleteDoctor(Long id) {
		try {
			
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all doctors: {}", e.getMessage());
		}

		
	}
	
	public Doctor updateDoctor(Long id) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all doctors: {}", e.getMessage());
			return null;
		}
	}
}
