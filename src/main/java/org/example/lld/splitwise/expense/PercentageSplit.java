package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.Split;

import java.util.List;

public class PercentageSplit implements ExpenseValidator{

    @Override
    public boolean validate(List<Split> splits, int amount) {
        int splitPercentage = splits.stream().mapToInt(Split::getPercentage).sum();
        if(splitPercentage != 100)
            return false;
        splits.forEach(split -> split.setAmount(split.getPercentage() * amount));
        return true;
    }
}
