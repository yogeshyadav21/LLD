package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.User;
import org.example.lld.atm.enums.AtmOperation;

public abstract class AtmState {

    public boolean insertCard(Atm atm, User user){
        System.out.println("OOPS, Something went wrong");
        return false;
    }
    public boolean enterPin(Atm atm, int pin){
        System.out.println("OOPS, Something went wrong");
        return false;
    }
    public void selectOperation(Atm atm, AtmOperation operation){
        System.out.println("OOPS, Something went wrong");
    }
    public boolean withdrawCash(Atm atm, int amount){
        System.out.println("OOPS, Something went wrong");
        return false;
    }
    public int checkBalance(Atm atm){
        System.out.println("OOPS, Something went wrong");
        return 0;
    }

    public boolean addCash(Atm atm, int amount){
        System.out.println("OOPS, Something went wrong");
        return false;
    }

}
