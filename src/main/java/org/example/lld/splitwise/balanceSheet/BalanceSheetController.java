package org.example.lld.splitwise.balanceSheet;

import org.example.lld.splitwise.Split;
import org.example.lld.splitwise.user.User;
import org.example.lld.splitwise.expense.Expense;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public BalanceSheetController() {
    }

    public void addBalance(Expense expense){
        List<Split> splits = expense.getSplits();
        Map<User, Balance> paidUser = expense.getPaidby().getBalanceSheet().getUserBalanceMap();
        for(Split split : splits){
            User user = split.getUser();
            if(split.getAmount() <= 0)
                continue;
            if(!paidUser.containsKey(user)){
                paidUser.put(user, new Balance());
            }
            paidUser.get(user).addAmountGet(split.getAmount());
            Map<User, Balance> balanceMap = user.getBalanceSheet().getUserBalanceMap();
            addUserBalance(balanceMap, expense.getPaidby(), split.getAmount());
        }
    }

    public void addUserBalance(Map<User, Balance> balanceMap, User user, int amount){
        if(!balanceMap.containsKey(user)){
            balanceMap.put(user, new Balance());
        }
        Balance balance = balanceMap.get(user);
        balance.addAmountOwe(amount);
    }
}
