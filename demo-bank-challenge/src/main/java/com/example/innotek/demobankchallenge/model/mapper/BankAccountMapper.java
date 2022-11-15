package com.example.innotek.demobankchallenge.model.mapper;

import com.example.innotek.demobankchallenge.model.balance.Balance;
import com.example.innotek.demobankchallenge.model.balance.ServerResponseBalance;
import com.example.innotek.demobankchallenge.model.banktransfer.BankTransferResult;
import com.example.innotek.demobankchallenge.model.banktransfer.ServerResponseBankTransferResult;
import com.example.innotek.demobankchallenge.model.server.ServerResponse;
import com.example.innotek.demobankchallenge.model.transaction.ServerResponseTransactions;
import com.example.innotek.demobankchallenge.model.transaction.Transaction;
import com.example.innotek.demobankchallenge.model.transaction.TransactionHistory;
import com.example.innotek.demobankchallenge.model.transaction.TransactionPayload;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
	ServerResponseBalance toResponseBalance(ServerResponse<Balance> sourceResponse);
	ServerResponseTransactions toResponseTransactions(ServerResponse<TransactionPayload> sourceResponse);
	ServerResponseBankTransferResult toResponseBankTransfer(ServerResponse<BankTransferResult> sourceResponse);
	
	TransactionHistory toTransactionHistory (Transaction source, int accountId);
	
}
