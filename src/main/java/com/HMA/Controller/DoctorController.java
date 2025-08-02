package com.HMA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMA.Service.DoctorService;
import com.HMA.models.Bill;
import com.HMA.models.Doctor;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping
	public List<Doctor> getAllDoctors(){
		
		System.out.println("Fetching the Doctors");
		return doctorService.getAllDoctors();
		
	}
	
	@PostMapping
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		System.out.println("Creating Doctor");
		return null;
		
	}

	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable Long id) {
		System.out.println("fetching by id"+id);
		return doctorService.getDoctorById(id);
		
	}
	@DeleteMapping("/{id}")
	public void deleteDoctor(@PathVariable Long id) {
		System.out.println("Delete Doctor"+id);
		doctorService.deleteDoctor(id);
		
	}
	
	@PutMapping("/{id}")
	public void updateDoctor(@PathVariable Long id) {
		System.out.println("Update Bill"+id);
		doctorService.updateDoctor(id);
		
	}
}
