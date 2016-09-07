package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer-info")
public class BankInfoController {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/account-info/{SomeUserId}")
	public AccountInformationModel getBankAccountInfo(
			@PathParam("SomeUserId") String userId) {

		// 1 . Call service method to get bank Information
		// 2. return the response back to client

		AccountInfoService accountService = new AccountInfoServiceImpl();

		AccountInformationModel response = accountService
				.getInformation(userId);

		Response.Status.OK.getStatusCode();

		return response;

	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/account-info/{SomeUserId}")
	public AccountInformationModel postBankAccountInfo(
			@PathParam("SomeUserId") String userId,
			AccountInformationModel accountInfo) {

		// 1 . Call service method to get bank Information
		// 2. return the response back to client

		AccountInfoService accountService = new AccountInfoServiceImpl();

		AccountInformationModel response = accountService.postInformation(
				userId, accountInfo);

		Response.Status.CREATED.getStatusCode();

		return response;

	}

}
