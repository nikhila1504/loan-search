package com.cts.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cts.bean.Loan;
import com.cts.service.LoanService;

@RunWith(SpringRunner.class)
@WebMvcTest(LoanController.class)
public class SearchController {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LoanService loanService;

	@Test
	public void getLoanByLoanNumberTest() throws Exception {
		when(loanService.getLoanByLoanNumber( 101))
				.thenReturn(new Loan(101, 500000, 5,"nikhila","damaraju", "8272828873","active", LocalDate.of(2019,05,05),"sitedocuments"));

		RequestBuilder request = MockMvcRequestBuilders.get("/loan/num/{loanNumber}", 101).accept(MediaType.APPLICATION_JSON);

		mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content()
				.json("{\"loanNumber\":101,\"loanAmount\":500000,\"loanTerm\":5,\"firstName\":\"nikhila\",\"lastName\":\"damaraju\",\"contactNo\":\"8272828873\",\"status\":\"active\",\"originalDate\":\"2019-05-05\",\"legalDocuments\":\"sitedocuments\"}"))
				.andReturn();
	}
	@Test
	public void getLoanByFirstNameTest() throws Exception {
		when(loanService.getLoanByFirstName("nikhila"))
				.thenReturn(new Loan(101, 500000, 5,"nikhila","damaraju", "8272828873","active", LocalDate.of(2019,05,05),"sitedocuments"));

		RequestBuilder request = MockMvcRequestBuilders.get("/loan/name/{firstName}", "nikhila").accept(MediaType.APPLICATION_JSON);

		mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content()
				.json("{\"loanNumber\":101,\"loanAmount\":500000,\"loanTerm\":5,\"firstName\":\"nikhila\",\"lastName\":\"damaraju\",\"contactNo\":\"8272828873\",\"status\":\"active\",\"originalDate\":\"2019-05-05\",\"legalDocuments\":\"sitedocuments\"}"))
				.andReturn();
	}
	@Test
	public void getLoanByLastNameTest() throws Exception {
		when(loanService.getLoanByLastName("damaraju"))
				.thenReturn(new Loan(101, 500000, 5,"nikhila","damaraju", "8272828873","active", LocalDate.of(2019,05,05),"sitedocuments"));

		RequestBuilder request = MockMvcRequestBuilders.get("/loan/get/{lastName}", "damaraju").accept(MediaType.APPLICATION_JSON);

		mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content()
				.json("{\"loanNumber\":101,\"loanAmount\":500000,\"loanTerm\":5,\"firstName\":\"nikhila\",\"lastName\":\"damaraju\",\"contactNo\":\"8272828873\",\"status\":\"active\",\"originalDate\":\"2019-05-05\",\"legalDocuments\":\"sitedocuments\"}"))
				.andReturn();
	}



}
