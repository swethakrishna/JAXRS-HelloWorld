package com.javacodegeeks.enterprise.rest.jersey;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AccountInformationDao {

	public AccountInformationModel postInformationDao(String userId,
			AccountInformationModel postInfo) {

		String acctName = postInfo.getAccountName();
		BigInteger acctNumber = postInfo.getAccountNumber();
		BigDecimal acctBal = postInfo.getAccountbalance();

		sqlQuery();

		postInfo.setConfirmationNumber("BackedResponse.confNumber");
		return postInfo;

	}

	private void sqlQuery() {
		String insertTableSQL = "INSERT INTO DBUSER"
				+ "(USER_ID, ACCT_NAME, ACCT_NUMBER, ACCT_BALANCE) VALUES"
				+ "(userId, acctName, acctNumber, acctBal)";

		String insertTableSQL1 = "INSERT INTO DBUSER (USER_ID, ACCT_NAME, ACCT_NUMBER, ACCT_BALANCE) VALUES (userId, postInfo.getAccountName(), postInfo.getAccountNumber(), postInfo.getAccountbalance())";
	}

	// This is DataBase Response
	public AccountInformationModel getBankInfoFromDB(String userId) {

		AccountInformationModel acctInformation = new AccountInformationModel();

		acctInformation.setAccountName("Swetha Checking Account");
		acctInformation.setAccountbalance(new BigDecimal(10735));
		acctInformation.setAccountNumber(new BigInteger("9734730083586"));

		return acctInformation;
	}

}
