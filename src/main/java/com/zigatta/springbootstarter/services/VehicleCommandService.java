package com.zigatta.springbootstarter.services;

import java.util.UUID;

import com.zigatta.springbootstarter.dto.VehicleCreateDTO;
import com.zigatta.springbootstarter.dto.VehicleQueryDTO;


public interface VehicleCommandService {

    public UUID createVehicle(VehicleCreateDTO vehicleCreateDTO);

}
