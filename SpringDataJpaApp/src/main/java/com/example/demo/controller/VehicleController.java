package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vehicle;
import com.example.demo.exception.DriverNotFoundException;
import com.example.demo.exception.VehicleAlreadyExistsException;
import com.example.demo.exception.VehicleNotFoundException;
import com.example.demo.service.IVehicleService;
@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/vehicle")
public class VehicleController {
	@Autowired
	private IVehicleService service;
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vehicle>> getVehicleList()throws VehicleNotFoundException
	{
		List<Vehicle> list1 = service.getAllVehicles();
		return new ResponseEntity<List<Vehicle>>(list1,HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v1)throws DriverNotFoundException
	{
		Vehicle vc = service.insertVehicle(v1);
		return new ResponseEntity<Vehicle>(vc,HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/{vehicleid}")  
	public ResponseEntity<String> deleteVehicle(@PathVariable("vehicleid") int vehicleid) throws VehicleNotFoundException  
	{ 
		boolean flag = service.deleteVehicle(vehicleid);
		ResponseEntity<String> msg = null;
		if(flag == true) {
			msg = new ResponseEntity<String>("Vehicle Deleted Sucessfully",HttpStatus.OK);
		}else {
			msg = new ResponseEntity<String>("Vehicle Not Deleted",HttpStatus.NOT_FOUND);
		}
		return msg;
	}
	@PutMapping("/edit/{vehicleid}")
	public ResponseEntity<Vehicle> editVehicle(@PathVariable("vehicleid") int id,@RequestBody Vehicle v1)throws VehicleNotFoundException
	{
		Vehicle vc = service.editVehicle(v1,id);
		return new ResponseEntity<Vehicle>(vc,HttpStatus.OK);
	}
	@GetMapping(value="/search/{brand}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vehicle>> getVehicle(@PathVariable String brand)throws VehicleNotFoundException
	{
		List<Vehicle> list1 = service.searchVehicleByBrand(brand);
		return new ResponseEntity<List<Vehicle>>(list1, HttpStatus.OK);
	}
//	@ExceptionHandler(value = VehicleNotFoundException.class)
//    public ResponseEntity handleVehicleNotFoundException(VehicleNotFoundException vehicleNotFoundException) {
//        return new ResponseEntity("Oops!Vehicle Not Found", HttpStatus.CONFLICT);
//    }
	@ExceptionHandler(value = VehicleAlreadyExistsException.class)
    public ResponseEntity handleVehicleAlreadyExistsException(VehicleAlreadyExistsException vehicleAlreadyExistsException) {
        return new ResponseEntity("Oops!Vehicle Already Exists", HttpStatus.CONFLICT);
    }
	
}
