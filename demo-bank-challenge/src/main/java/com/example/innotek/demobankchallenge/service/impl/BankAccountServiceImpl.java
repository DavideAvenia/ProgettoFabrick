package com.example.innotek.demobankchallenge.service.impl;

import com.example.innotek.demobankchallenge.entities.Transactions;
import com.example.innotek.demobankchallenge.service.BankAccountService;

import java.util.List;
import java.util.Optional;

public class BankAccountServiceImpl implements BankAccountService {
    @Override
    public Optional<Transactions> getBalance(int accountId) {
        return null;
    }

    @Override
    public List<Transactions> moneyTransfer(String from, String to, Double amount) {
        return null;
    }

    @Override
    public List<Transactions> getTransactions(int accountId) {
        return null;
    }
}
