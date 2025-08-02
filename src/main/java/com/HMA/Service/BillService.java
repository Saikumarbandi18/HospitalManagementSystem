package com.HMA.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMA.Repository.BillRepository;
import com.HMA.models.Appointment;
import com.HMA.models.Bill;

@Service
public class BillService {
	
	private static final Logger logger = LoggerFactory.getLogger(BillService.class);
	
	@Autowired
	private BillRepository billRepository;
	public List<Bill> getAllBills(){
		try {
			logger.info("Fetching all bills from database");
			return billRepository.findAll();
		}catch(Exception e) {
			logger.error("An error occurred while fetching all bills: {}", e.getMessage());
			return null;
		}
	}
	
	public Bill getBillById(Long id) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			return null;
		}
	}
	public Bill createBill(Bill bill) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all bills: {}", e.getMessage());
			return null;
		}

	}
	
	
	public void deleteBill(Long id) {
		try {
			
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all bills: {}", e.getMessage());
		}

		
	}
	
	public Bill updateBill(Long id) {
		try {
			return null;
			
		}catch(Exception e) {
			System.out.println("Error message: "+e.getMessage());
			logger.error("An error occurred while fetching all bills: {}", e.getMessage());
			return null;
		}
	}
}
