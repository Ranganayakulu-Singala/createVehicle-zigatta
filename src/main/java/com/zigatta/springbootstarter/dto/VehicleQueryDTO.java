package com.zigatta.springbootstarter.dto;

import java.util.UUID;

public class VehicleQueryDTO {

    private UUID vin;

    private String year;

    private String make;

    private String model;
    
    private String transmissionType;

    

    public VehicleQueryDTO(UUID vin, String year, String make, String model, String transmissionType) {
		super();
		this.vin = vin;
		this.year = year;
		this.make = make;
		this.model = model;
		this.transmissionType = transmissionType;
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
        return "VehicleQueryDTO{" +
        		  "vin=" + vin +
                  ", year='" + year + '\'' +
                  ", make='" + make + '\'' +
                  ", model='" + model + '\'' +
                  ", transmissionType='" + transmissionType + '\'' +
                  '}';
    }
}
