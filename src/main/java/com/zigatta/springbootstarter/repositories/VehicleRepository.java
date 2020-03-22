package com.zigatta.springbootstarter.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zigatta.springbootstarter.entities.Vehicle;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
public interface VehicleRepository extends CrudRepository<Vehicle, UUID> {

    List<Vehicle> findByMake(@Param("make") String make);
}
