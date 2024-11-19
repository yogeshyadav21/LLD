package org.example.lld.splitwise.user;

import org.example.lld.splitwise.balanceSheet.BalanceSheet;

import java.util.UUID;

public class User {
    UUID userId;
    String name;
    BalanceSheet balanceSheet;

    public User(UUID userId, String name) {
        this.userId = userId;
        this.name = name;
        this.balanceSheet = new BalanceSheet();
    }

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", balanceSheet=" + balanceSheet +
                '}';
    }
}
