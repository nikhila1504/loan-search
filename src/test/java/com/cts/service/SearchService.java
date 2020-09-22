package com.cts.service;
import static org.junit.Assert.assertSame;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.cts.bean.Loan;
import com.cts.repository.LoanRepository;


@RunWith(MockitoJUnitRunner.Silent.class)
public class SearchService {
	@Mock
	private LoanRepository repo;
	
	@InjectMocks
	private LoanService service;
	
	@Test
	public void getLoanByLoanNumberTest() {
		Loan loan=new Loan(101,500000,5, "nikhila","damaraju","9999999999","active",LocalDate.of(2019,05,05),"sitedocuments");
		Mockito.when(repo.findByLoanNumber(101)).thenReturn(loan);
		assertSame(101, service.getLoanByLoanNumber(loan.getLoanNumber()).getLoanNumber());
	}
	@Test
	public void getLoanByFirstNameTest() {
		Loan loan=new Loan(101,500000,5, "nikhila","damaraju","9999999999","active",LocalDate.of(2019,05,05),"sitedocuments");
		Mockito.when(repo.findByFirstName("nikhila")).thenReturn(loan);
		assertSame("nikhila", service.getLoanByFirstName(loan.getFirstName()).getFirstName());
	}
	@Test
	public void getLoanByLastNameTest() {
		Loan loan=new Loan(101,500000,5, "nikhila","damaraju","9999999999","active",LocalDate.of(2019,05,05),"sitedocuments");
		Mockito.when(repo.findByLastName("damaraju")).thenReturn(loan);
		assertSame("damaraju", service.getLoanByLastName(loan.getLastName()).getLastName());
	}


	

}
