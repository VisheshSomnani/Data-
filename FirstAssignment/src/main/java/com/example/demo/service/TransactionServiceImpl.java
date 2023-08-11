package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITransactionDao;
import com.example.demo.entity.Transaction;
@Service
public class TransactionServiceImpl implements ITransactionService{
	
	@Autowired
	ITransactionDao dao;
	@Override
	public List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Transaction insertTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

}
