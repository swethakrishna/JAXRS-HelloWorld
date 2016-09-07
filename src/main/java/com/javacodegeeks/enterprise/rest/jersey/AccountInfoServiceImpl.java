package com.javacodegeeks.enterprise.rest.jersey;

import java.math.BigInteger;

public class AccountInfoServiceImpl implements AccountInfoService {

	// this gets accountInfo from Dao and returns to Controller.
	public AccountInformationModel getInformation(String userId) {

		AccountInformationDao accountInformationDao = new AccountInformationDao();

		AccountInformationModel response = accountInformationDao
				.getBankInfoFromDB(userId);

		return response;
	}

	private static final Exception Exception = null;

	public AccountInformationModel postInformation(String userId,
			AccountInformationModel accountInformationModel) {

		// Server Side Validation
		if (userId != null) {
			try {
				throw Exception;
			} catch (java.lang.Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		BigInteger acctNumb = accountInformationModel.getAccountNumber();
		if (acctNumb != null && acctNumb != new BigInteger("123")) {
			try {
				throw Exception;
			} catch (java.lang.Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		AccountInformationDao accountInformationDao = new AccountInformationDao();
		AccountInformationModel response = accountInformationDao
				.postInformationDao(userId, accountInformationModel);

		return response;
	}

	public String updateInformation(String somethingToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInformation(String somethingToDelete) {
		// TODO Auto-generated method stub

	}


	

}
