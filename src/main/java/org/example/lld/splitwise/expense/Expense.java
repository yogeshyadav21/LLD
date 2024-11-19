package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.Split;
import org.example.lld.splitwise.user.User;
import org.example.lld.splitwise.enums.ExpenseType;

import java.util.List;
import java.util.UUID;

public class Expense {
    UUID expenseId;
    int amount;
    User paidby;
    ExpenseType expenseType;
    List<Split> splits;

    public Expense(UUID expenseId, int amount, User paidby, ExpenseType expenseType, List<Split> splits) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidby = paidby;
        this.expenseType = expenseType;
        this.splits = splits;
    }

    public UUID getExpenseId() {
        return expenseId;
    }

    public int getAmount() {
        return amount;
    }

    public User getPaidby() {
        return paidby;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public List<Split> getSplits() {
        return splits;
    }
}