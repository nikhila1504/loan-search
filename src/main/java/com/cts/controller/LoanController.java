package com.cts.controller;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bean.Loan;
import com.cts.service.LoanService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/loan")
public class LoanController {
	
	@Autowired
	LoanService service;
	
	Logger logger = LoggerFactory.getLogger(LoanController.class);

	
	@GetMapping(value = "/num/{loanNumber}")
	public ResponseEntity<Loan> getLoanByLoanNumber(@PathVariable int loanNumber) {
		return new ResponseEntity<>(service.getLoanByLoanNumber(loanNumber),HttpStatus.OK);
	}
	
	@GetMapping(value = "/name/{firstName}")
	public ResponseEntity<Loan>  getLoanByFirstName(@PathVariable String firstName) {
		return new ResponseEntity<>(service.getLoanByFirstName(firstName),HttpStatus.OK);
	}
	@GetMapping(value = "/get/{lastName}")
	public ResponseEntity<Loan> getLoanByLastName(@PathVariable String lastName) {
		return new ResponseEntity<>(service.getLoanByLastName(lastName),HttpStatus.OK);
	}

}
