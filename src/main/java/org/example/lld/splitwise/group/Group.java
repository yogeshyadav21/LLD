package org.example.lld.splitwise.group;

import org.example.lld.splitwise.Split;
import org.example.lld.splitwise.enums.ExpenseType;
import org.example.lld.splitwise.expense.Expense;
import org.example.lld.splitwise.user.User;
import org.example.lld.splitwise.expense.ExpenseController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    UUID groupId;
    List<User> users;
    List<Expense> expenses;
    ExpenseController expenseController;

    public Group(ExpenseController expenseController) {
        this.groupId = UUID.randomUUID();
        this.users = new ArrayList<>();
        this.expenses = new ArrayList<>();
        this.expenseController = expenseController;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(int amount, User paidBy, ExpenseType expenseType, List<Split> splits){
        Expense expense = expenseController.createExpense(amount, paidBy, expenseType, splits);
        this.getExpenses().add(expense);
    }

    public void addUser(User user){
        this.getUsers().add(user);
    }
}
