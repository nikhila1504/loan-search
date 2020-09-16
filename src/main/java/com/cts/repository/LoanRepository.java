package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.bean.Loan;

public interface LoanRepository extends CrudRepository<Loan,Long>{
	
Loan findByLoanNumber(Long loanNumber);
Loan findByFirstName(String firstName);
Loan findByLastName(String lastName);





}
