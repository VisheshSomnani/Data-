package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Transaction;

public interface ITransactionService {
	public List<Transaction> getAllTransactions();
	public Transaction insertTransaction(Transaction t);
}
