package org.example.lld.atm;

import org.example.lld.atm.atmState.AtmState;
import org.example.lld.atm.cashWithdrawer.CashProcessor;

public class Atm {

    AtmState atmState;
    User user;
    int twoThousandNotes;
    int fiveHundredNotes;
    int oneHundredNotes;
    CashProcessor cashProcessor;


    public Atm(AtmState atmState, int twoThousandNotes, int fiveHundredNotes, int oneHundredNotes, CashProcessor cashProcessor) {
        this.atmState = atmState;
        this.twoThousandNotes = twoThousandNotes;
        this.fiveHundredNotes = fiveHundredNotes;
        this.oneHundredNotes = oneHundredNotes;
        this.cashProcessor = cashProcessor;
    }

    public AtmState getAtmState() {
        return atmState;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTwoThousandNotes() {
        return twoThousandNotes;
    }

    public void setTwoThousandNotes(int twoThousandNotes) {
        this.twoThousandNotes = twoThousandNotes;
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public void setFiveHundredNotes(int fiveHundredNotes) {
        this.fiveHundredNotes = fiveHundredNotes;
    }

    public int getOneHundredNotes() {
        return oneHundredNotes;
    }

    public void setOneHundredNotes(int oneHundredNotes) {
        this.oneHundredNotes = oneHundredNotes;
    }

    public CashProcessor getCashProcessor() {
        return cashProcessor;
    }

    public void setCashProcessor(CashProcessor cashProcessor) {
        this.cashProcessor = cashProcessor;
    }
}
