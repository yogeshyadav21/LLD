package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.Split;

import java.util.List;

public interface ExpenseValidator {

    boolean validate(List<Split> splits, int amount);

}
