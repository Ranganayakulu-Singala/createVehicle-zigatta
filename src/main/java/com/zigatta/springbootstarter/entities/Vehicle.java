package com.zigatta.springbootstarter.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import com.zigatta.error.validator.TransmissionTypeValidatorConstraint;


import java.util.UUID;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    private UUID vin;
    @NotEmpty
    private String year;
    @NotEmpty
    private String make;
    @NotEmpty
    private String model;
    @NotEmpty
    @TransmissionTypeValidatorConstraint
    private String transmissionType;

	public Vehicle() {
    }

    public UUID getVin() {
        return vin;
    }
    
	public void setVin(UUID vin) {
		this.vin = vin;
	}


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}


    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                '}';
    }
}
