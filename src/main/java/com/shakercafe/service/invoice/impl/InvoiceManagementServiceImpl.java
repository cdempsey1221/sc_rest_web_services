package com.shakercafe.service.invoice.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shakercafe.domain.Invoice;
import com.shakercafe.repository.InvoiceRepository;
import com.shakercafe.service.invoice.InvoiceManagementService;

@Service("invoiceManagementService")
public class InvoiceManagementServiceImpl implements InvoiceManagementService {
	
	@Inject
	private InvoiceRepository repository;
	
	/* (non-Javadoc)
	 * @see com.shakercafe.service.invoice.impl.InvoiceManagementService#findAllInvoices()
	 */
	@Override
	public List<Invoice> findAllInvoices() {

		return ( repository.findAll() );

	}

	/* (non-Javadoc)
	 * @see com.shakercafe.service.invoice.impl.InvoiceManagementService#saveInvoice(com.shakercafe.domain.Invoice)
	 */
	@Override
	public void saveInvoice(Invoice invoice) {
		
		if ( invoice != null ) {
			
			repository.save( invoice );
			
		}
		
	}


}
