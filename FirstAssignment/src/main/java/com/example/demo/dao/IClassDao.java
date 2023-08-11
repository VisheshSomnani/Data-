package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Class;
@Repository
public interface IClassDao extends JpaRepository<Class,Integer>{

}
