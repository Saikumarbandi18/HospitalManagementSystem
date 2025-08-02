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

import com.HMA.Service.AppointmentService;
import com.HMA.Service.PatientService;
import com.HMA.models.Appointment;
import com.HMA.models.Patient;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping
	public List<Appointment> getAllAppointments(){
		
		System.out.println("Fetching the Appointment");
		return appointmentService.getAllAppointments();
		
	}
	
	@PostMapping
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		System.out.println("Creating Appointment");
		return appointmentService.createAppointment(appointment);
		
	}

	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable Long id) {
		System.out.println("fetching by id"+id);
		return appointmentService.getAppointmentById(id);
		
	}
	@DeleteMapping("/{id}")
	public void deleteAppointment(@PathVariable Long id) {
		System.out.println("Delete appointment"+id);
		appointmentService.deleteAppointment(id);
		
	}
	
	@PutMapping("/{id}")
	public void updateAppointment(@PathVariable Long id) {
		System.out.println("Update appointment"+id);
		appointmentService.updateAppointment(id);
		
	}
}
