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

import com.HMA.Service.BillService;
import com.HMA.models.Appointment;
import com.HMA.models.Bill;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {
	
	@Autowired
	private BillService billService;
	@GetMapping
	public List<Bill> getAllBills(){
		
		System.out.println("Fetching the Bills");
		return billService.getAllBills();
		
	}
	
	@PostMapping
	public Bill createBill(@RequestBody Bill bill) {
		System.out.println("Creating Bill");
		return billService.createBill(bill);
		
	}

	@GetMapping("/{id}")
	public Bill getBillById(@PathVariable Long id) {
		System.out.println("fetching by id"+id);
		return null;
		
	}
	@DeleteMapping("/{id}")
	public void deleteBill(@PathVariable Long id) {
		System.out.println("Delete Bill"+id);
		billService.deleteBill(id);
		
	}
	
	@PutMapping("/{id}")
	public void updateBill(@PathVariable Long id) {
		System.out.println("Update Bill"+id);
		billService.updateBill(id);
		
	}
}
