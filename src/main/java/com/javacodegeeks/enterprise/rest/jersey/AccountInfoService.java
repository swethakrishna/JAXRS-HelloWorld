package com.javacodegeeks.enterprise.rest.jersey;

public interface AccountInfoService {
	
	AccountInformationModel getInformation(String something);
	
	AccountInformationModel postInformation(String userId, AccountInformationModel accountInfo);
	
	String updateInformation(String somethingToUpdate);
	
	void deleteInformation(String somethingToDelete);

}
