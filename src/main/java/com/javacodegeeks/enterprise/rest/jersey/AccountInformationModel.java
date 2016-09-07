package com.javacodegeeks.enterprise.rest.jersey;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown=true)
@XmlType(name="")
public class AccountInformationModel {

	private BigInteger accountNumber;

	private BigDecimal accountbalance;

	private String accountName;
	
	private String confirmationNumber;

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(BigDecimal accountbalance) {
		this.accountbalance = accountbalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public AccountInformationModel() {

	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

}
