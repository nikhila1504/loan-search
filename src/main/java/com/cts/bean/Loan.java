package com.cts.bean;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "LoanDetails")
public class Loan {
	    @Id
	    private int loanNumber;
	    private int loanAmount;
	    private int loanTerm;
	    private String firstName;
	    private String lastName;
	    private String contactNo;
	    private String status;
	    private LocalDate originalDate;
	    private String legalDocuments;
	    
		public int getLoanNumber() {
			return loanNumber;
		}
		public void setLoanNumber(int loanNumber) {
			this.loanNumber = loanNumber;
		}
		public int getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(int loanAmount) {
			this.loanAmount = loanAmount;
		}
		public int getLoanTerm() {
			return loanTerm;
		}
		public void setLoanTerm(int loanTerm) {
			this.loanTerm = loanTerm;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDate getOriginalDate() {
			return originalDate;
		}
		public void setOriginalDate(LocalDate originalDate) {
			this.originalDate = originalDate;
		}
		public String getLegalDocuments() {
			return legalDocuments;
		}
		public void setLegalDocuments(String legalDocuments) {
			this.legalDocuments = legalDocuments;
		}
		
		public Loan(int loanNumber, int loanAmount, int loanTerm, String firstName, String lastName, String contactNo,
				String status, LocalDate originalDate, String legalDocuments) {
			super();
			this.loanNumber = loanNumber;
			this.loanAmount = loanAmount;
			this.loanTerm = loanTerm;
			this.firstName = firstName;
			this.lastName = lastName;
			this.contactNo = contactNo;
			this.status = status;
			this.originalDate = originalDate;
			this.legalDocuments = legalDocuments;
		}
		
		public Loan() {
			super();
		}
	    
	    
		
}

