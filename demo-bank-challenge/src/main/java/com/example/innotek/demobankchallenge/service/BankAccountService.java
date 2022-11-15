package com.example.innotek.demobankchallenge.service;

import com.example.innotek.demobankchallenge.model.balance.Balance;
import com.example.innotek.demobankchallenge.model.banktransfer.BankTransferResult;
import com.example.innotek.demobankchallenge.model.server.ServerResponse;
import com.example.innotek.demobankchallenge.model.transaction.TransactionPayload;

public interface BankAccountService {
    ServerResponse<Balance> getBalance(int accountId);
    ServerResponse<BankTransferResult> moneyTransfer(String from, String to, Double amount);
    ServerResponse<TransactionPayload> getTransactions(int accountId);
}
