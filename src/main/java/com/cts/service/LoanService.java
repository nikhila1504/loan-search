package com.cts.service;


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

	
	public Loan getLoanByLoanNumber(int loanNumber) {
		Loan loan=new Loan();
		loan= repo.findByLoanNumber(loanNumber);
		return loan;
	}

	
	public Loan getLoanByFirstName(String firstName) {
		Loan loan1=new Loan();
		loan1= repo.findByFirstName(firstName);
		return loan1;
	}
	
	public Loan getLoanByLastName(String lastName) {
		Loan loan2=new Loan();
		loan2= repo.findByLastName(lastName);
		return loan2;
	}



}
