package com.smtaps.demoApi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authaccess")
public class ExternalServicesController {
	

	@GetMapping
    @PreAuthorize("hasRole('customer')")
    public ResponseEntity<String> getProductsByShopperWithFilters() {
        
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
 
}
