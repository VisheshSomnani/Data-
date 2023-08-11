package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.beans.Customer;
import com.demo.beans.Product;
@Configuration
@ComponentScan(value = "com.demo.beans")
public class MyConfig {
	
}
