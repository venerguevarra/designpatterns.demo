package com.bootcamp.patterns.chainofresponsiblity;

import com.bootcamp.patterns.chainofresponsiblity.interfaces.CashDispenser;

public class OneHundredCashDispenser extends AbstractCashDispenser implements CashDispenser {
    private static final int ONE_HUNDRED_NOTE = 100;

    @Override
    public int getNote() {
        return ONE_HUNDRED_NOTE;
    }

}
