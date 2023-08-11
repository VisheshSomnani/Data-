package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vehicle;
import com.example.demo.exception.DriverMissingException;
import com.example.demo.exception.VehicleNotFoundException;
//@Service
public interface IVehicleService {
	public List<Vehicle> getAllVehicles()throws VehicleNotFoundException;
	public Vehicle insertVehicle(Vehicle c) throws DriverMissingException;
	public boolean deleteVehicle(int id) throws VehicleNotFoundException;
	public Vehicle editVehicle(Vehicle v1, int id) throws VehicleNotFoundException;
	public List<Vehicle> searchVehicleByBrand(String brand) throws VehicleNotFoundException;
}
