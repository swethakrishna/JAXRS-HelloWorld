package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customerinfo")
public class CustomerInfoController {

	@GET
	@Path("/{someCustId}")
	public CustomerInformationModel getCustomerInformation(
			@PathParam("someCustId") String custId) {

		CustomerInfoService getCustinfo = new CustomerInfoserviceImpl();

		CustomerInformationModel response = getCustinfo.customerInfo(custId);

		return response;

	}
	
	

}
