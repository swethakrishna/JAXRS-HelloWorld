//package com.javacodegeeks.enterprise.rest.jersey;
//
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.core.Response;
//
//@Path("/swethasridhar")
//public class HelloWorldController {
//
//	@GET
//	public Response respondmsg(@PathParam("parameter") String parameter) {
//
//		String output = "Hello from: " + parameter + " : " + "swethasri";
//
//		return Response.status(200).entity(output).build();
//	}
//
//	@GET
//	@Path("/{parameter}")
//	public Response respondmsgaa(@PathParam("parameter") float definition1) {
//		String output = "Hello from: " + definition1 + " : " + "swethasri";
//
//		return Response.status(200).entity(output).build();
//	}
//
//	@GET
//	@Path("/get/{abc}")
//	public Response respondmsg1(@PathParam("abc") int definition) {
//
//		String output = "Hello from: " + definition + " : " + "swethasridhar";
//
//		return Response.status(200).entity(output).build();
//	}
//
//	@POST
//	@Path("/post/{parameter}")
//	public Response testPost(float definition1) {
//
//		String output = "Hello from: POST:" + definition1 + " : " + "swethasri";
//
//		return Response.status(201).entity(output).build();
//	}
//
//	@PUT
//	@Path("/put/{parameter}")
//	public Response testPut(@PathParam("parameter") float definition1) {
//
//		String output = "Hello from Put: " + definition1 + " : " + "swethasri";
//
//		return Response.status(204).entity(output).build();
//	}
//
//	@DELETE
//	@Path("/delete/{parameter}")
//	public Response testDelete(@PathParam("parameter") float definition1) {
//
//		//do some logic to Delete here
//		
//		return Response.status(204).build();
//	}
//
//}
