package com.bootcamp.patterns.chainofresponsiblity.interfaces;

import com.bootcamp.patterns.chainofresponsiblity.bean.Cash;

public interface CashDispenser {
    void chain(CashDispenser cashDispenser);
    void dispense(Cash cash);
}
