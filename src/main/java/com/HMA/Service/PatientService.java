package com.HMA.Service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;  // ← Correct import
import org.springframework.stereotype.Service;

import com.HMA.Repository.PatientRepository;
import com.HMA.models.Patient;
@Service
public class PatientService {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Page<Patient> getAllPatients(int page,int size){
		try {
			System.out.println("into service layer:");
			Pageable pageable = PageRequest.of(page, size);
			return patientRepository.findAll(pageable);
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all patients: {}", e.getMessage());
			return null;
		}
	}
	
	public Patient getPatientById(Long id) {
		try {
			Optional<Patient> patient = patientRepository.findById(id);
			return patient.orElse(null);
		} catch(Exception e) {
			System.out.println("Error message: " + e.getMessage());
			logger.error("An error occurred while fetching patient by ID {}: {}", id, e.getMessage());
			return null;
		}
	}

	public Patient createPatient(Patient patient) {
		try {
			patientRepository.save(patient);
			return patient;	
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all patients: {}", e.getMessage());
			
			return null;
		}

	}
	
	
	public void deletePatient(Long id) {
		try {
			patientRepository.deleteById(id);
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all patients: {}", e.getMessage());
		}

		
	}
	
	public Patient updatePatient(Long id, Patient updatePatient) {
		try {
			Optional<Patient> existingPatient=patientRepository.findById(id);
			if(existingPatient.isPresent()) {
				Patient p=existingPatient.get();
				p.setName(updatePatient.getName());
				p.setAge(updatePatient.getAge());
				p.setGender(updatePatient.getGender());
				patientRepository.save(p);
				
				return updatePatient;
				
				
			} else {
				logger.warn("Patient with ID {} not found for update", id);
				return null;
			}
		} catch(Exception e) {
			System.out.println("Error message: " + e.getMessage());
			logger.error("An error occurred while updating patient with ID {}: {}", id, e.getMessage());
			return null;
		}
	}


}
