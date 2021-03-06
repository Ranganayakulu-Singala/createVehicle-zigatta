package com.zigatta.springbootstarter.controllers;

import com.zigatta.springbootstarter.dto.VehicleQueryDTO;
import com.zigatta.springbootstarter.services.VehicleQueryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/vehicle-api/v1/vehicles")
public class VehicleQueryController {

    @Autowired
    private VehicleQueryService vehicleQueryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<VehicleQueryDTO>> listAllVehicles(){
        return new ResponseEntity<>(vehicleQueryService.listAllVehicles(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<VehicleQueryDTO> getVehicle(@PathVariable(value = "id") UUID id){
        return new ResponseEntity<>(vehicleQueryService.getVehicle(id), HttpStatus.OK);
    }
}
