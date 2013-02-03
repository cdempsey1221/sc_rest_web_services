package com.shakercafe.service.invoice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.shakercafe.domain.Invoice;

@Path("/invoices")
public interface InvoiceManagementService {

	@GET
	@Produces( { "application/json" } )
	public abstract List<Invoice> findAllInvoices();

	@POST
	@Consumes( { "application/json" } )
	public abstract void saveInvoice(Invoice invoice);

}