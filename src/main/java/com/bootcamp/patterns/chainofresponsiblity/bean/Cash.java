package com.bootcamp.patterns.chainofresponsiblity.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cash {
    private BigDecimal amount;

    public Cash(int amount) {
        this.amount = new BigDecimal(amount);
    }
}
