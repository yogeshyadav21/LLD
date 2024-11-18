package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.BankAccount;
import org.example.lld.atm.BankTransaction;
import org.example.lld.atm.User;
import org.example.lld.atm.enums.AtmOperation;


import java.time.LocalDateTime;

public class AddCash extends AtmState {


    @Override
    public boolean addCash(Atm atm, int amount) {
        BankAccount bankAccount = atm.getUser().getBankAccount();
        int balance = bankAccount.getBalance() + amount;
        BankTransaction bankTransaction = new BankTransaction(AtmOperation.ADD_CASH, balance, LocalDateTime.now());
        System.out.println("Successfully added " + amount);
        atm.setAtmState(new IdleState());
        System.out.println("Thank you " + atm.getUser().getName() + " your transaction is successful, Please remove your card");
        return true;
    }
}
