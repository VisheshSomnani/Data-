package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Enrollment;
@Repository
public interface IEnrollmentDao extends JpaRepository<Enrollment,Integer>{

}
