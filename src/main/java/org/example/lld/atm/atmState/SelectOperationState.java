package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.enums.AtmOperation;


public class SelectOperationState extends AtmState {

    @Override
    public void selectOperation(Atm atm, AtmOperation operation) {

        switch (operation){
            case CHECK_BALANCE -> {
                System.out.println("We're proceeding with the checkBalance");
                atm.setAtmState(new CheckBalance());
            }
            case WITHDRAW_CASH -> {
                System.out.println("We're proceeding with the cashWithdraw");
                atm.setAtmState(new WithdrawCash());
            }
            case ADD_CASH -> {
                System.out.println("We're proceeding with adding the cash");
                atm.setAtmState(new AddCash());
            }
            default -> {
                System.out.println("OOPS, This is not a operation");
            }
        }

    }
}
