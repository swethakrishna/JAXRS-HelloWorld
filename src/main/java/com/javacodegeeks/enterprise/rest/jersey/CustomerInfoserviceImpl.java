package com.javacodegeeks.enterprise.rest.jersey;

public class CustomerInfoserviceImpl implements CustomerInfoService {

	public CustomerInformationModel customerInfo(String customerId) {

		CustomerInfoDao custInfo = new CustomerInfoDao();
		
		CustomerInformationModel response = custInfo.customerInfoDao(customerId);
		
		
		
		return response;

		// TODO Auto-generated method stub

	}

}
