package com.cts.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.Loan;
import com.cts.repository.LoanRepository;

@Service
public class LoanService {
	@Autowired
	LoanRepository repo;
	
	Logger logger = LoggerFactory.getLogger(LoanService.class);

	
	public Loan getLoanByLoanNumber(Long loanNumber) {
		return repo.findByLoanNumber(loanNumber);
	}

	
	public Loan getLoanByFirstName(String firstName) {
		return repo.findByFirstName(firstName);
	}
	
	public Loan getLoanByLastName(String lastName) {
		return repo.findByLastName(lastName);
	}



}
