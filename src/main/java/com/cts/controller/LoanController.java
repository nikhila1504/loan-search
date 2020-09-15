package com.cts.controller;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	Optional<Loan> getLoanByLoanNumber(@PathVariable Long loanNumber) {
		return service.getLoanByLoanNumber(loanNumber);
	}
	
	@GetMapping(value = "/name/{firstName}")
	Optional<Loan> getLoanByFirstName(@PathVariable String firstName) {
		return service.getLoanByFirstName(firstName);
	}
	@GetMapping(value = "/get/{lastName}")
	Optional<Loan> getLoanByLastName(@PathVariable String lastName) {
		return service.getLoanByLastName(lastName);
	}

}
