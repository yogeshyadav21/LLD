package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.enums.ExpenseType;

public class ExpenseValidatorFactory {

    static ExpenseValidator getExpenseValidator(ExpenseType expenseType){
        return switch (expenseType){
            case EQUAL_SPLIT -> new EqualSplit();
            case NO_SPLIT -> new NoSplit();
            case UNEQUAL_SPLIT -> new UnequalSplit();
            case PERCENTAGE_SPLIT -> new PercentageSplit();
            default -> null;
        };
    }
}
