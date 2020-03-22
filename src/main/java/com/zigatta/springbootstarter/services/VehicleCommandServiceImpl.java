package com.zigatta.springbootstarter.services;

import com.zigatta.springbootstarter.dto.VehicleCreateDTO;
import com.zigatta.springbootstarter.dto.VehicleQueryDTO;
import com.zigatta.springbootstarter.entities.Vehicle;
import com.zigatta.springbootstarter.repositories.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleCommandServiceImpl implements VehicleCommandService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public UUID createVehicle(VehicleCreateDTO vehicleCreateDTO) {
        Vehicle newVehicle = new Vehicle();

        newVehicle.setVin(UUID.randomUUID());
        newVehicle.setYear(vehicleCreateDTO.getYear());
        newVehicle.setMake(vehicleCreateDTO.getMake());
        newVehicle.setModel(vehicleCreateDTO.getModel());
        newVehicle.setTransmissionType(vehicleCreateDTO.getTransmissionType());

        return vehicleRepository.save(newVehicle).getVin();
    }

}
