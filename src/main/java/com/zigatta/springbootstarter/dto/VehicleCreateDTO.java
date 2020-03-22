package com.zigatta.springbootstarter.dto;

public class VehicleCreateDTO {

	private String year;

    private String make;

    private String model;
    
    private String transmissionType;


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
        return "VehicleCreateDTO{" +
        		  ", year='" + year + '\'' +
                  ", make='" + make + '\'' +
                  ", model='" + model + '\'' +
                  ", transmissionType='" + transmissionType + '\'' +
                '}';
    }
}
