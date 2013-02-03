package com.shakercafe.service.vendor.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shakercafe.domain.Vendor;
import com.shakercafe.repository.VendorRepository;
import com.shakercafe.service.vendor.VendorManagementService;

@Service("vendorManagementService")
public class VendorManagementServiceImpl implements VendorManagementService {
	
	@Inject
	private VendorRepository vendorRepository;
	
	public List<Vendor> findAllCurrentVendors() {

		return ( vendorRepository.findAllCurrent() );

	}

	public Vendor findVendorByName(String name) {

		return ( vendorRepository.findByName(name) );

	}
	
	public List<Vendor> findAllVendors() {

		return ( vendorRepository.findAll() );

	}


}
