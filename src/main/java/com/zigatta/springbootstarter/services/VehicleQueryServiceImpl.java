package com.zigatta.springbootstarter.services;

import com.zigatta.springbootstarter.dto.VehicleQueryDTO;
import com.zigatta.springbootstarter.entities.Vehicle;
import com.zigatta.springbootstarter.repositories.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VehicleQueryServiceImpl implements VehicleQueryService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public VehicleQueryDTO getVehicle(UUID id) {
        if (vehicleRepository.findById(id).isPresent()){
            Vehicle fetchedVehicle = vehicleRepository.findById(id).get();
            return new VehicleQueryDTO(fetchedVehicle.getVin(), fetchedVehicle.getYear(), fetchedVehicle.getMake(), fetchedVehicle.getModel(),fetchedVehicle.getTransmissionType());
        }else{
            return null;
        }
    }

    @Override
    public List<VehicleQueryDTO> listAllVehicles() {
        List<VehicleQueryDTO> vehicleList = new ArrayList<>();

        vehicleRepository.findAll().forEach(vehicle -> {
            vehicleList.add(new VehicleQueryDTO(vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),vehicle.getTransmissionType()));
        });

        return vehicleList;
    }
}
