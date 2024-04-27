package com.smtaps.demoApi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.smtaps.demoApi.controller.ExternalServicesController;

public class ExternalServicesControllerTest {
	
    @Test
    public void testGetProductsByShopperWithFilters() {
       
    	ExternalServicesController controller = new ExternalServicesController();
        ResponseEntity<String> responseEntity = controller.getProductsByShopperWithFilters();

         assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("SUCCESS", responseEntity.getBody());
    }


}
