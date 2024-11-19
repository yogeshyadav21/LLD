package org.example.lld.splitwise.expense;

import org.example.lld.splitwise.Split;
import org.example.lld.splitwise.user.User;
import org.example.lld.splitwise.balanceSheet.BalanceSheetController;
import org.example.lld.splitwise.enums.ExpenseType;

import java.util.List;
import java.util.UUID;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController(BalanceSheetController balanceSheetController) {
        this.balanceSheetController = balanceSheetController;
    }

    public Expense createExpense(int amount, User paidby, ExpenseType expenseType, List<Split> splits){
        ExpenseValidator expenseValidator = ExpenseValidatorFactory.getExpenseValidator(expenseType);
        if(!expenseValidator.validate(splits, amount)){
            System.out.println("OOPS, You're split calculation is wrong, try again");
            return null;
        }
        Expense expense = new Expense(UUID.randomUUID(), amount, paidby, expenseType, splits);
        balanceSheetController.addBalance(expense);
        return expense;
    }
}
