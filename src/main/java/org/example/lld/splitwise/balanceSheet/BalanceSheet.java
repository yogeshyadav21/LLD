package org.example.lld.splitwise.balanceSheet;

import org.example.lld.splitwise.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BalanceSheet {

    UUID balanceSheetId;
    Map<User, Balance> userBalanceMap;

    public BalanceSheet() {
        this.balanceSheetId = UUID.randomUUID();
        this.userBalanceMap = new HashMap<>();
    }

    public UUID getBalanceSheetId() {
        return balanceSheetId;
    }

    public Map<User, Balance> getUserBalanceMap() {
        return userBalanceMap;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BalanceSheetId is ").append(balanceSheetId).append("\n");
        userBalanceMap.forEach((user, balance) -> {
            stringBuilder.append(user.getName()).append(" ").append(balance).append("\n");
        });
        return stringBuilder.toString();
    }
}
