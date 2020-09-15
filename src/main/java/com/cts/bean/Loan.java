package com.cts.bean;
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
	    private long loanNumber;
	    private long loanAmount;
	    private int loanTerm;
	    private String firstName;
	    private String lastName;
	    private String contactNo;
	    private String status;
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private Date originalDate;
	    private String legalDocuments;
		public long getLoanNumber() {
			return loanNumber;
		}
		public void setLoanNumber(long loanNumber) {
			this.loanNumber = loanNumber;
		}
		public long getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(long loanAmount) {
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
		public Date getOriginalDate() {
			return originalDate;
		}
		public void setOriginalDate(Date originalDate) {
			this.originalDate = originalDate;
		}
		public String getLegalDocuments() {
			return legalDocuments;
		}
		public void setLegalDocuments(String legalDocuments) {
			this.legalDocuments = legalDocuments;
		}
		public Loan(long loanNumber, long loanAmount, int loanTerm, String firstName, String lastName, String contactNo,
				String status, Date originalDate, String legalDocuments) {
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

