package com.bootcamp.patterns.chainofresponsiblity;

import com.bootcamp.patterns.chainofresponsiblity.interfaces.CashDispenser;

public class FiveHundredCashDispenser extends AbstractCashDispenser implements CashDispenser {
    private static final int FIVE_HUNDRED_NOTE = 500;

    @Override
    public int getNote() {
        return FIVE_HUNDRED_NOTE;
    }
}
