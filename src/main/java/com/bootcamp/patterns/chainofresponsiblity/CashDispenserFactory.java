package com.bootcamp.patterns.chainofresponsiblity;

import com.bootcamp.patterns.chainofresponsiblity.interfaces.CashDispenser;

public class CashDispenserFactory {
    private static CashDispenserFactory INSTANCE;

    private CashDispenserFactory() {
    }

    public static CashDispenserFactory instance() {
        if (INSTANCE == null) {
            INSTANCE = new CashDispenserFactory();
        }
        return INSTANCE;
    }

    public CashDispenser getCashDispenser(CashDispenserType type) {
        CashDispenser cashDispenser = null;
        switch (type) {
            case ONE_THOUSAND_CASH_DISPENSER:
                cashDispenser = new OneThousandCashDispenser();
                break;
            case FIVE_HUNDRED_CASH_DISPENSER:
                cashDispenser = new FiveHundredCashDispenser();
                break;
            case ONE_HUNDRED_CASH_DISPENSER:
                cashDispenser = new OneHundredCashDispenser();
                break;
        }
        return cashDispenser;
    }
}
