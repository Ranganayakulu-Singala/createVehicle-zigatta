package com.zigatta.springbootstarter;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.zigatta.springbootstarter.entities.Vehicle;

import junit.framework.Assert;

@TestComponent
public class TestPostVehicleImpl {
	@Test
	public void testCreateVehicle() throws URISyntaxException{
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:8080/vehicle-api/v1/vehicles/vehicle";
	    URI uri = new URI(baseUrl);
	    
	    Vehicle audi = new Vehicle();
		audi.setVin(UUID.randomUUID());
		audi.setYear("2017");
		audi.setMake("Audi");
		audi.setModel("Q5");
		audi.setTransmissionType("MANUAL");
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Vehicle> request = new HttpEntity<>(audi, headers);
		
		try
	    {
			ResponseEntity<String> response=restTemplate.postForEntity(uri, request, String.class);
			Assert.assertEquals(201, response.getStatusCodeValue());
			
	    }
	    catch(HttpClientErrorException ex) 
	    {
	        //Verify bad request and missing header
	        Assert.assertEquals(400, ex.getRawStatusCode());
	        Assert.assertEquals(true, ex.getResponseBodyAsString().contains("Missing request header"));
	    }

	}
}
