package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVehicleDao;
import com.example.demo.entity.Vehicle;
import com.example.demo.exception.DriverMissingException;
import com.example.demo.exception.VehicleNotFoundException;

import jakarta.transaction.Transactional;
@Service
public class VehicleServiceImpl implements IVehicleService{
	@Autowired
	private IVehicleDao dao;
	@Override
	public List<Vehicle> getAllVehicles()throws VehicleNotFoundException
	{
		return dao.findAll();
	}
	@Override
	@Transactional
	public Vehicle insertVehicle(Vehicle v) throws DriverMissingException{
		if(v.getDriver()== null) {
			throw new DriverMissingException();
		}
		// TODO Auto-generated method stub
		return dao.save(v);
	}
	@Override
	@Transactional
	public boolean deleteVehicle(int id)  throws VehicleNotFoundException  
	{  if(dao.existsById(id)) {
			dao.deleteById(id);
		}else {
			throw new VehicleNotFoundException();
		}
		return true;
	}
	
	@Override
	@Transactional
	public Vehicle editVehicle(Vehicle v1, int id) throws VehicleNotFoundException
	{
		
		Vehicle updatedVeh = null;
		
		if(dao.existsById(id)) {
			updatedVeh = dao.save(v1);
		}else {
			throw new VehicleNotFoundException();
		}
		return updatedVeh;
	}
	@Override
	public List<Vehicle> searchVehicleByBrand(String brand) throws VehicleNotFoundException
	{
		List<Vehicle> ls = dao.getVehicleByBrand(brand);
		
		if(ls.isEmpty()) {
			throw new VehicleNotFoundException();
		}
		return ls;
	}
	
}
