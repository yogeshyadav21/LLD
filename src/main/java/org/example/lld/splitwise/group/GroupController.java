package org.example.lld.splitwise.group;

import org.example.lld.splitwise.balanceSheet.BalanceSheetController;
import org.example.lld.splitwise.expense.ExpenseController;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    List<Group> groups;

    public GroupController() {
        this.groups = new ArrayList<>();
    }

    public void createGroup(){
        Group group = new Group(new ExpenseController(new BalanceSheetController()));
        groups.add(group);
    }

    public void addGroup(Group group){
        groups.add(group);
    }

}
