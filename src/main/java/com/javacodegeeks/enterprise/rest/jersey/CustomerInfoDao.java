package com.javacodegeeks.enterprise.rest.jersey;

public class CustomerInfoDao {
	
	public CustomerInformationModel customerInfoDao(String custId){
		
		CustomerInformationModel custInfoDao = getCustomerInfoFromDB(custId);
		
		return custInfoDao;
	}

	private CustomerInformationModel getCustomerInfoFromDB(String custId) {
		
		CustomerInformationModel custInfoDao = new CustomerInformationModel();
		custInfoDao.setAge("20");
		custInfoDao.setGender("female");
		custInfoDao.setName("swetha");
		custInfoDao.setPhoneNum("6149739723");
		return custInfoDao;
	}

}