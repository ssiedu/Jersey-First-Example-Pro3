package com.ssi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("company")
public class CompanyResource {

	
	@Path("name")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String companyName(){
		String info="SSI, INDORE";
		return info;
	}
	
	@Path("address")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String companyAddress(){
		String info="Bhanwar Kua, Indore";
		return info;
	}
}
