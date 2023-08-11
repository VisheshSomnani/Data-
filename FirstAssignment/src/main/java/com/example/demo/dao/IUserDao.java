package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Enrollment;
import com.example.demo.entity.User;
@Repository
public interface IUserDao extends JpaRepository<User,Integer>{
	
	

}
