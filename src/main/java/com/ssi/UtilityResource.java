package com.ssi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("date")
public class UtilityResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showServerDate(){
		java.util.Date date=new java.util.Date();
		String dateStr=date.toString();
		return dateStr;
	}
}
