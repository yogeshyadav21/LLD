package org.example.lld.atm.cashWithdrawer;

import org.example.lld.atm.Atm;
import org.example.lld.atm.enums.Cash;

public class FiveHundredProcessor extends CashProcessor {

    private Cash cash = Cash.FIVE_HUNDRED;

    public FiveHundredProcessor(CashProcessor cashProcessor) {
        super(cashProcessor);
    }

    @Override
    public boolean withDraw(Atm atm, int amount) {
        if (amount == 0)
            return true;
        int notes = atm.getFiveHundredNotes();
        int notesRequired = amount / cash.getValue();
        boolean result;
        if (notesRequired > 0) {
            notesRequired = (notes - notesRequired >= 0) ? notesRequired : notes;
            result = cashProcessor.withDraw(atm, amount - notesRequired * cash.getValue());
        } else {
            result = cashProcessor.withDraw(atm, amount);
        }
        if (!result)
            return false;
        atm.setFiveHundredNotes(notes - notesRequired);
        System.out.println("Notes withdraw of five hundred are: " + notesRequired);
        return true;
    }
}
