package com.HMA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HMA.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
	
}
