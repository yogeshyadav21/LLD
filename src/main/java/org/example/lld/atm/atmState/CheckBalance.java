package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.BankAccount;
import org.example.lld.atm.BankTransaction;
import org.example.lld.atm.enums.AtmOperation;


public class CheckBalance extends AtmState {

    @Override
    public int checkBalance(Atm atm) {
        BankAccount bankAccount = atm.getUser().getBankAccount();
        System.out.println("The balance in your account is " + bankAccount.getBalance());
        atm.setAtmState(new IdleState());
        System.out.println("Thank you " + atm.getUser().getName() + " your transaction is successful, Please remove your card");
        return bankAccount.getBalance();
    }
}
