package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Transaction;
import com.example.demo.service.ITransactionService;
@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private ITransactionService service;
	@PostMapping("/add")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction b1)
	{
		Transaction vc = service.insertTransaction(b1);
		return new ResponseEntity<Transaction>(vc,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Transaction>> getAllTransactions(){
		return new ResponseEntity<List<Transaction>>(service.getAllTransactions(),HttpStatus.OK);
	}
}
