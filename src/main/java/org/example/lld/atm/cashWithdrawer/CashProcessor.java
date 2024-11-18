package org.example.lld.atm.cashWithdrawer;

import org.example.lld.atm.Atm;

public abstract class CashProcessor {

    CashProcessor cashProcessor;

    protected CashProcessor(CashProcessor cashProcessor) {
        this.cashProcessor = cashProcessor;
    }

    public abstract boolean withDraw(Atm atm, int amount);
}
