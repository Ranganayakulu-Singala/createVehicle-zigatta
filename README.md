# spring-boot-starter
ReadMe Notes:

To Start Application
	Navigate to com.zigatta.springbootstarter.SpringBootStarterApplication.java Right click on it and then Run As a Java Application. 
	
Test Cases:
	As per the requirement we provided URL like below
	http://localhost:8080/vehicle-api/v1/vehicles/vehicle
	
Use swagger to test the application:
	Open Browser and hit below URL
	http://localhost:8080/swagger-ui.html#
	
	You should see two controller 
	1) Vehicle Command Controller -> To Create a Vehicle
	2) Vehicle Query Controller -> To get list of Vehicles created and query eatch Vehicle by passing vin.
	
	a) Post a Vehicle 
		POST /vehicle-api/v1/vehicles/vehicle
		Request Body
		{
		  "make": "Maruthi",
		  "model": "Baleno",
		  "transmissionType": "MANUAL",
		  "year": "2019"
		}
	
	b) Get All Vehicles 
		GET /vehicle-api/v1/vehicles
		hit TryOut button to get All Vehicles created.
		
		GET /vehicle-api/v1/vehicles/{id}
		To get one vehicle details. Please pass vin as a querry parameter.
		


	Invalid Cases
		Passing invalid transmissionType. 
		request body
		{
		  "make": "Maruthi",
		  "model": "Baleno",
		  "transmissionType": "MANUAL1",
		  "year": "2019"
		}
		
		Response:
		{
		  "status": "400 BAD_REQUEST",
		  "message": "Error!",
		  "body": "Invalid TransmissionType. It should be AUTO or MANUAL"
		}
		
		Missing values in payload. Model is missing in below payload
		{
		  "make": "Maruthi",
		  "transmissionType": "MANUAL",
		  "year": "2019"
		}
		Response from API:
		{
		  "status": "400 BAD_REQUEST",
		  "message": "Error!",
		  "body": "Missing Year or Make or Model or TransmissionType in payload"
		}
		
To run Unit Test cases:
	Got to com.zigatta.springbootstarter.TestPostVehicleImpl.java and right click and Run As JUnit Test.
		
		
		
		
		
		
		
		
		
	

