package com.example.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("api")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "APPLICATION_JSON" media type.
	 *
	 * @return message String that will be returned as a APPLICATION_JSON response.
	 */
	@Path("/hello")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHi() {
		String message = "hi!";
		Response response = Response.status(Response.Status.OK).entity(message).type(MediaType.APPLICATION_JSON)
				.build();
		return response;
	}
}
