package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.BankAccount;
import org.example.lld.atm.BankTransaction;
import org.example.lld.atm.enums.AtmOperation;

import java.time.LocalDateTime;

public class WithdrawCash extends AtmState {

    @Override
    public boolean withdrawCash(Atm atm, int amount) {
        BankAccount bankAccount = atm.getUser().getBankAccount();
        if(bankAccount.getBalance() < amount){
            System.out.println("OOPS!!, LOW BALANCE");
            return false;
        }
        if(!atm.getCashProcessor().withDraw(atm, amount)){
            System.out.println("Don't have enough CASH in the ATM");
            return false;
        }
        int balance = bankAccount.getBalance() - amount;
        BankTransaction bankTransaction = new BankTransaction(AtmOperation.WITHDRAW_CASH, balance, LocalDateTime.now());
        bankAccount.setBalance(balance);
        bankAccount.addBankTransactions(bankTransaction);
        System.out.println("Successful withdraw");
        atm.setAtmState(new IdleState());
        System.out.println("Thank you " + atm.getUser().getName() + " your transaction is successful, Please remove your card");
        return true;
    }
}
