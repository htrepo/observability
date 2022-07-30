package com.cv.observability.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@RequestMapping("/transaction")
@Validated
public interface Transaction {

    @PostMapping("/credit")
    BigDecimal credit(@NotNull @DecimalMin(value = "0.0", inclusive = false) BigDecimal amount);

    @PostMapping("/debit")
    BigDecimal debit(@NotNull @DecimalMin(value = "0.0", inclusive = false) BigDecimal amount);
}
