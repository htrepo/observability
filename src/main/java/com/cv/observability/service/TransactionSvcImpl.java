package com.cv.observability.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransactionSvcImpl implements TransactionSvc{

    private BigDecimal balance;

    @Override
    public BigDecimal credit(BigDecimal amount) {
        synchronized (this){
            balance=balance.add(amount);
        }
        return balance;
    }

    @Override
    public BigDecimal debit(BigDecimal amount) {
        synchronized (this){
            balance=balance.subtract(amount);
        }
        return balance;
    }
}
