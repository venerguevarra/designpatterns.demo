package com.bootcamp.patterns.chainofresponsiblity;

import com.bootcamp.patterns.chainofresponsiblity.bean.Cash;
import com.bootcamp.patterns.chainofresponsiblity.interfaces.CashDispenser;

public abstract class AbstractCashDispenser {
    private CashDispenser cashDispenser;

    public void chain(CashDispenser cashDispenser) {
        this.cashDispenser = cashDispenser;
    }

    public void dispense(Cash cash) {
        final int amount = cash.getAmount().intValue();
        if (amount >= getNote()) {
            final int numberOfNotes = amount / getNote();
            final int remainingAmountToDispense = amount % getNote();

            System.out.println(String.format("Dispensing %sx %s note", numberOfNotes, getNote()));

            if (remainingAmountToDispense > 0) {
                cashDispenser.dispense(new Cash(remainingAmountToDispense));
            }
        } else {
            cashDispenser.dispense(cash);
        }

    }

    public abstract int getNote();
}
