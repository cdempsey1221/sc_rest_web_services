package com.shakercafe.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shakercafe.service.invoice.InvoiceManagementService;
import com.shakercafe.service.invoice.impl.InvoiceManagementServiceImpl;
import com.shakercafe.service.vendor.VendorManagementService;
import com.shakercafe.service.vendor.impl.VendorManagementServiceImpl;

@Configuration
public class ServiceConfig { 

    @Bean 
    public VendorManagementService vendorManagementService() {
        return new VendorManagementServiceImpl();
    }

    @Bean 
    public VendorManagementServiceImpl vendorManagementServiceImpl() {
        return new VendorManagementServiceImpl();
    }
    
    @Bean 
    public InvoiceManagementService invoiceManagementService() {
        return new InvoiceManagementServiceImpl();
    }
    
}