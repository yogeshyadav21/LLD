package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.Split;

import java.util.List;

public class NoSplit implements ExpenseValidator{

    @Override
    public boolean validate(List<Split> splits, int amount) {
        int splitAmount = splits.stream().mapToInt(Split::getAmount).sum();
        return (splitAmount == 0);
    }
}
