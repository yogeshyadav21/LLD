package org.example.lld.atm;

import org.example.lld.atm.atmState.IdleState;
import org.example.lld.atm.cashWithdrawer.CashProcessor;
import org.example.lld.atm.cashWithdrawer.FiveHundredProcessor;
import org.example.lld.atm.cashWithdrawer.OneHundredProcessor;
import org.example.lld.atm.cashWithdrawer.TwoThousandProcessor;
import org.example.lld.atm.enums.AtmOperation;

import java.time.LocalDate;
import java.util.UUID;

public class AtmController {

    public AtmController() {
        initialize();
    }


    public void initialize(){
        BankAccount bankAccount = new BankAccount(UUID.randomUUID(), 50000);
        Card card = new Card(UUID.randomUUID(), 33333, LocalDate.of(2010, 12, 30));
        User user = new User(UUID.randomUUID(), "SP", bankAccount, card);

        CashProcessor cashProcessor = new TwoThousandProcessor(new FiveHundredProcessor( new OneHundredProcessor(null)));
        Atm atm = new Atm(new IdleState(), 2, 5, 20, cashProcessor);

        atm.getAtmState().insertCard(atm, user);
        atm.getAtmState().enterPin(atm, 33333);
        atm.getAtmState().selectOperation(atm, AtmOperation.CHECK_BALANCE);
        atm.getAtmState().checkBalance(atm);
        atm.getAtmState().insertCard(atm, user);
        atm.getAtmState().enterPin(atm, 33333);
        atm.getAtmState().selectOperation(atm, AtmOperation.WITHDRAW_CASH);
        atm.getAtmState().withdrawCash(atm, 10000);
    }



}
