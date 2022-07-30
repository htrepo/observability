package com.cv.observability.controller;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class TransactionImpl implements Transaction{

    @Override
    public BigDecimal credit(BigDecimal amount) {
        return null;
    }

    @Override
    public BigDecimal debit(BigDecimal amount) {
        return null;
    }
}
