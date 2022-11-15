package com.example.innotek.demobankchallenge.controller;

import com.example.innotek.demobankchallenge.model.mapper.BankAccountMapper;
import com.example.innotek.demobankchallenge.model.balance.Balance;
import com.example.innotek.demobankchallenge.model.balance.ServerResponseBalance;
import com.example.innotek.demobankchallenge.model.server.ServerResponse;
import com.example.innotek.demobankchallenge.service.BankAccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/bank/account/{accountId}")
@RequiredArgsConstructor
public class BankAccountController {
    private final BankAccountService service;

    private final BankAccountMapper mapper;

    @GetMapping("/balance")
    @Operation(summary = "Return account balance")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The actual balance for the account is retrieved", content = {
                    @Content(mediaType = APPLICATION_JSON_VALUE)})
    })
    public ResponseEntity<ServerResponseBalance> getBalance(@PathVariable final int accountId) {
        ServerResponse<Balance> resultBalance = this.service.getBalance(accountId);


        ServerResponseBalance result = mapper.toResponseBalance(resultBalance);

        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/getTransactions")
    @Operation(summary = "Return account transactions")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The actual balance for the account is retrieved", content = {
                    @Content(mediaType = APPLICATION_JSON_VALUE)})
    })

    public void getTransactions(@PathVariable final int accountId) {
        service.getTransactions(accountId);
    }

    @PostMapping("/moneyTransfer")
    @Operation(summary = "Transfer from an account to another")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The actual balance for the account is retrieved", content = {
                    @Content(mediaType = APPLICATION_JSON_VALUE)})
    })

    public void moneyTransfer(
            @PathVariable final String from,
            @PathVariable final String to,
            @PathVariable final Double amount) {
        service.moneyTransfer(from, to, amount);
    }
}