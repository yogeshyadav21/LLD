package org.example.lld.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BankAccount {

    UUID bankAccountId;
    int balance;
    List<BankTransaction> bankTransactions;

    public BankAccount(UUID bankAccountId, int balance) {
        this.bankAccountId = bankAccountId;
        this.balance = balance;
        this.bankTransactions = new ArrayList<>();
    }

    public UUID getBankAccountId() {
        return bankAccountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<BankTransaction> getBankTransactions() {
        return bankTransactions;
    }

    public void addBankTransactions(BankTransaction bankTransactions) {
        this.bankTransactions.add(bankTransactions);
    }
}
