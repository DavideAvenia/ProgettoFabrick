package com.example.innotek.demobankchallenge.service.impl;

import com.example.innotek.demobankchallenge.config.RestConsumer;
import com.example.innotek.demobankchallenge.model.balance.Balance;
import com.example.innotek.demobankchallenge.model.banktransfer.BankTransferResult;
import com.example.innotek.demobankchallenge.model.server.ServerResponse;
import com.example.innotek.demobankchallenge.model.transaction.TransactionPayload;
import com.example.innotek.demobankchallenge.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private RestConsumer restConsumer;

    @Override
    public ServerResponse<Balance> getBalance(int accountId) {return null;}

    @Override
    public ServerResponse<BankTransferResult> moneyTransfer(String from, String to, Double amount) {
        return null;
    }

    @Override
    public ServerResponse<TransactionPayload> getTransactions(int accountId) {
        return null;
    }
}
