package com.HMA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HMA.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	
	
	

}
