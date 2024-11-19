package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.Split;

import java.util.List;

public class EqualSplit implements ExpenseValidator{

    @Override
    public boolean validate(List<Split> splits, int amount) {
        int splitAmount = splits.stream().mapToInt(Split::getAmount).sum();
        boolean equalSplit = splits.stream().allMatch(split -> split.getAmount() == amount/splits.size());
        return (splitAmount == amount && equalSplit);
    }
}
