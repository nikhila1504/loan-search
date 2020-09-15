package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.bean.Loan;

public interface LoanRepository extends CrudRepository<Loan,Long>{
	
Optional<Loan> findByLoanNumber(Long loanNumber);
Optional<Loan> findByFirstName(String firstName);
Optional<Loan> findByLastName(String lastName);





}
