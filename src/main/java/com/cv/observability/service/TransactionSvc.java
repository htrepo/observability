package com.cv.observability.service;

import java.math.BigDecimal;

public interface TransactionSvc {
    BigDecimal credit(BigDecimal amount);
    BigDecimal debit(BigDecimal amount);

}
