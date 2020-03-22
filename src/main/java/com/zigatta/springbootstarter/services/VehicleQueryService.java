package com.zigatta.springbootstarter.services;

import java.util.List;
import java.util.UUID;

import com.zigatta.springbootstarter.dto.VehicleQueryDTO;

public interface VehicleQueryService {

    public VehicleQueryDTO getVehicle(UUID id);
    public List<VehicleQueryDTO> listAllVehicles();
}
