package com.zigatta.springbootstarter.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zigatta.springbootstarter.ResponseDTO;
import com.zigatta.springbootstarter.dto.VehicleCreateDTO;
@Service
public class VehicleValidation {
	 public ResponseEntity<ResponseDTO> validateInputDTO(VehicleCreateDTO vehicleCreateDTO){
			
	    	List<String> transmissionType = Arrays.asList("MANUAL", "AUTO");
	    	if(vehicleCreateDTO.getMake() == null || vehicleCreateDTO.getModel() == null || vehicleCreateDTO.getTransmissionType() == null || vehicleCreateDTO.getYear() == null ) {
	    		ResponseDTO responseDTO = new ResponseDTO();
	        	responseDTO.setStatus(HttpStatus.BAD_REQUEST.toString());
	        	responseDTO.setBody("Missing Year or Make or Model or TransmissionType in payload");
	        	responseDTO.setMessage("Error!");
	        	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
	    	}
	    	
	    	if(vehicleCreateDTO.getTransmissionType() != null && !transmissionType.contains(vehicleCreateDTO.getTransmissionType())) {
	    		ResponseDTO responseDTO = new ResponseDTO();
	        	responseDTO.setStatus(HttpStatus.BAD_REQUEST.toString());
	        	responseDTO.setBody("Invalid TransmissionType. It should be AUTO or MANUAL");
	        	responseDTO.setMessage("Error!");
	        	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
	    	}
	    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	    }
}
