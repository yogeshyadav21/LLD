package org.example.lld.atm.cashWithdrawer;

import org.example.lld.atm.Atm;
import org.example.lld.atm.enums.Cash;

public class OneHundredProcessor extends CashProcessor {

    private Cash cash = Cash.ONE_HUNDRED;

    public OneHundredProcessor(CashProcessor cashProcessor) {
        super(cashProcessor);
    }

    @Override
    public boolean withDraw(Atm atm, int amount) {
        if (amount == 0)
            return true;
        int notes = atm.getOneHundredNotes();
        int notesRequired = amount / cash.getValue();
        if (amount % cash.getValue() != 0 || notesRequired > notes) {
            return false;
        }
        System.out.println("Notes withdraw of 1 hundred are: " + notesRequired);
        atm.setOneHundredNotes(notes - notesRequired);
        return true;
    }
}
