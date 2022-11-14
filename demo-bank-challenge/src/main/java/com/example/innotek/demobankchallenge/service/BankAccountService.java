package com.example.innotek.demobankchallenge.service;

import com.example.innotek.demobankchallenge.entities.Transactions;

import java.util.List;
import java.util.Optional;

public interface BankAccountService {
    Optional<Transactions> getBalance(int accountId);

    List<Transactions> moneyTransfer(String from, String to, Double amount);
    List<Transactions> getTransactions(int accountId);
}
