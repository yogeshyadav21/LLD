package org.example.lld.atm.cashWithdrawer;

import org.example.lld.atm.Atm;
import org.example.lld.atm.enums.Cash;

public class TwoThousandProcessor extends CashProcessor {

    private Cash cash = Cash.TWO_THOUSAND;

    public TwoThousandProcessor(CashProcessor cashProcessor) {
        super(cashProcessor);
    }

    @Override
    public boolean withDraw(Atm atm, int amount) {
        int notes = atm.getTwoThousandNotes();
        int notesRequired = amount / cash.getValue();
        boolean result = false;
        if (notesRequired > 0) {
            notesRequired = (notes - notesRequired >= 0) ? notesRequired : notes;
            result = cashProcessor.withDraw(atm, amount - notesRequired * cash.getValue());
        } else {
            result = cashProcessor.withDraw(atm, amount);
        }
        if (!result)
            return false;
        atm.setTwoThousandNotes(notes - notesRequired);
        System.out.println("Notes withdraw of 2 thousands are: " + notesRequired);
        return true;
    }
}
