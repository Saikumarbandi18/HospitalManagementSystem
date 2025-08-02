package com.HMA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HMA.Repository.PatientRepository;
import com.HMA.Service.PatientService;
import com.HMA.models.Patient;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping
	public Page<Patient> getAllPatients(@RequestParam(defaultValue = "0")int page,
			@RequestParam(defaultValue = "2")int size){
		
		System.out.println("Fetching the patients");
		return patientService.getAllPatients(page,size);
		
	}
	
	@PostMapping
	public Patient createPatient(@RequestBody Patient patient) {
		System.out.println("Creating patient");
		return patientService.createPatient(patient);
		
	}

	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable Long id) {
		System.out.println("fetching by id");
		return patientService.getPatientById(id);
		
	}
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		
	}
	
	@PutMapping("/{id}")
	public Patient updatePatient(@PathVariable Long id,@RequestBody Patient patient){
		System.out.println("updating Patient with Id:"+id);
		return patientService.updatePatient(id, patient);
		
	}
}
