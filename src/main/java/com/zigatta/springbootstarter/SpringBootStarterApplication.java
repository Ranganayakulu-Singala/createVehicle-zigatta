package com.zigatta.springbootstarter;

import com.zigatta.springbootstarter.entities.Vehicle;
import com.zigatta.springbootstarter.repositories.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.UUID;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner {

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public void run(String... args) throws Exception {
		Vehicle tesla = new Vehicle();
		tesla.setVin(UUID.randomUUID());
		tesla.setYear("2018");
		tesla.setMake("Tesla");
		tesla.setModel("Model S");
		tesla.setTransmissionType("AUTO");
		vehicleRepository.save(tesla);
	}
}
