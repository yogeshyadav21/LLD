package org.example.lld.atm;

import java.util.UUID;

public class User {

    UUID userId;
    String name;
    BankAccount bankAccount;
    Card card;

    public User(UUID userId, String name, BankAccount bankAccount, Card card) {
        this.userId = userId;
        this.name = name;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public Card getCard() {
        return card;
    }
}
