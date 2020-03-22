package com.zigatta.springbootstarter.controllers;

import com.zigatta.springbootstarter.ResponseDTO;
import com.zigatta.springbootstarter.dto.VehicleCreateDTO;
import com.zigatta.springbootstarter.services.VehicleCommandService;
import com.zigatta.springbootstarter.services.VehicleValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/vehicle-api/v1/vehicles")
public class VehicleCommandController {

    @Autowired
    private VehicleCommandService vehicleCommandService;
    
    @Autowired VehicleValidation vehicleValidation;

    
    @PostMapping(path = "/vehicle")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ResponseDTO> createVehicle(@Valid @RequestBody VehicleCreateDTO vehicleCreateDTO){
    	ResponseEntity<ResponseDTO> validation=vehicleValidation.validateInputDTO(vehicleCreateDTO);
    	if(validation.getBody()!=null) {
    		return validation;
    	}
    	
    	ResponseDTO responseDTO = new ResponseDTO();
    	responseDTO.setStatus(HttpStatus.CREATED.toString());
    	responseDTO.setBody(vehicleCommandService.createVehicle(vehicleCreateDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    
   
}
