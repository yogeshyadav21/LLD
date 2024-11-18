package org.example.lld.atm;

import jdk.dynalink.Operation;
import org.example.lld.atm.enums.AtmOperation;

import java.time.LocalDateTime;

public class BankTransaction {

    AtmOperation operation;
    int balance;
    LocalDateTime localDateTime;

    public BankTransaction(AtmOperation operation, int balance, LocalDateTime localDateTime) {
        this.operation = operation;
        this.balance = balance;
        this.localDateTime = localDateTime;
    }

    public AtmOperation getOperation() {
        return operation;
    }

    public void setOperation(AtmOperation operation) {
        this.operation = operation;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
