package org.example.lld.splitwise;

import org.example.lld.splitwise.balanceSheet.BalanceSheetController;
import org.example.lld.splitwise.enums.ExpenseType;
import org.example.lld.splitwise.expense.ExpenseController;
import org.example.lld.splitwise.user.User;
import org.example.lld.splitwise.user.UserController;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {

    UserController userController;
    ExpenseController expenseController;
    BalanceSheetController balanceSheetController;

    public Splitwise() {
        this.userController = new UserController();
        this.balanceSheetController = new BalanceSheetController();
        this.expenseController = new ExpenseController(balanceSheetController);
    }

    public void initalize() {


        // Create Users
        User sp = userController.createUser("SP");
        User yogesh = userController.createUser("Yogesh");
        User deepak = userController.createUser("Deepak");
        User labham = userController.createUser("Labham");
        User raj = userController.createUser("Raj");
        User simran = userController.createUser("Simran");

// Expense 1: EQUAL_SPLIT
        List<Split> equalSplitExpense = new ArrayList<>();
        equalSplitExpense.add(new Split(yogesh, 100, 0));
        equalSplitExpense.add(new Split(deepak, 100, 0));
        equalSplitExpense.add(new Split(labham, 100, 0));

        expenseController.createExpense(300, sp, ExpenseType.EQUAL_SPLIT, equalSplitExpense);

// Expense 2: UNEQUAL_SPLIT
        List<Split> unequalSplitExpense = new ArrayList<>();
        unequalSplitExpense.add(new Split(sp, 150, 0)); // SP pays 150
        unequalSplitExpense.add(new Split(deepak, 100, 0)); // Deepak pays 100
        unequalSplitExpense.add(new Split(labham, 50, 0)); // Labham pays 50

        expenseController.createExpense(300, raj, ExpenseType.UNEQUAL_SPLIT, unequalSplitExpense);

// Expense 3: PERCENTAGE_SPLIT
        List<Split> percentSplitExpense = new ArrayList<>();
        percentSplitExpense.add(new Split(sp, 0, 40)); // SP covers 40%
        percentSplitExpense.add(new Split(yogesh, 0, 30)); // Yogesh covers 30%
        percentSplitExpense.add(new Split(deepak, 0, 30)); // Deepak covers 30%

// Ensure the total percentage equals 100
        expenseController.createExpense(500, simran, ExpenseType.PERCENTAGE_SPLIT, percentSplitExpense);

// Expense 4: NO_SPLIT
        List<Split> noSplitExpense = new ArrayList<>();
        noSplitExpense.add(new Split(sp, 0, 100)); // SP pays the entire amount

        expenseController.createExpense(500, sp, ExpenseType.NO_SPLIT, noSplitExpense);

// Expense 5: Weekend Trip using UNEQUAL_SPLIT
        List<Split> weekendSplit = new ArrayList<>();
        weekendSplit.add(new Split(sp, 300, 0)); // SP pays 300
        weekendSplit.add(new Split(yogesh, 200, 0)); // Yogesh pays 200
        weekendSplit.add(new Split(deepak, 100, 0)); // Deepak pays 100
        weekendSplit.add(new Split(raj, 200, 0)); // Raj pays 200

        expenseController.createExpense(800, simran, ExpenseType.UNEQUAL_SPLIT, weekendSplit);

// Expense 6: Dinner with PERCENTAGE_SPLIT
        List<Split> dinnerSplit = new ArrayList<>();
        dinnerSplit.add(new Split(sp, 0, 50)); // SP pays 50%
        dinnerSplit.add(new Split(raj, 0, 30)); // Raj pays 30%
        dinnerSplit.add(new Split(simran, 0, 20)); // Simran pays 20%

        expenseController.createExpense(400, raj, ExpenseType.PERCENTAGE_SPLIT, dinnerSplit);

// Expense 7: Unequal contribution for a Party
        List<Split> partySplit = new ArrayList<>();
        partySplit.add(new Split(sp, 300, 0)); // SP pays 300
        partySplit.add(new Split(yogesh, 200, 0)); // Yogesh pays 200
        partySplit.add(new Split(deepak, 100, 0)); // Deepak pays 100

        expenseController.createExpense(600, labham, ExpenseType.UNEQUAL_SPLIT, partySplit);

// Final Balances Check
        userController.getUsers().forEach(user -> {
            System.out.println("---------------------------------------------------------------");
            System.out.println(user);
            System.out.println("---------------------------------------------------------------");
        });

    }
}
















