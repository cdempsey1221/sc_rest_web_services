package com.shakercafe.service.vendor;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.shakercafe.domain.Vendor;

@Path( "/vendors" )
public interface VendorManagementService {
	
	@GET
	@Produces( { "application/json" } )
	@Path("/current")
	public List<Vendor> findAllCurrentVendors();
	
	@GET
	@Produces( { "application/json" } )
	@Path("/{name}")
	public Vendor findVendorByName(  @PathParam("name") final String name);
	
	@GET
	@Produces( { "application/json" } )
	public List<Vendor> findAllVendors(); 

}
