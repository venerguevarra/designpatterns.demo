package com.bootcamp.patterns.chainofresponsiblity;

import com.bootcamp.patterns.chainofresponsiblity.interfaces.CashDispenser;

public class OneThousandCashDispenser extends AbstractCashDispenser implements CashDispenser {
    private static final int ONE_THOUSAND_NOTE = 1_000;

    @Override
    public int getNote() {
        return ONE_THOUSAND_NOTE;
    }
}
