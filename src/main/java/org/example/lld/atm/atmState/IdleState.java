package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.User;


public class IdleState extends AtmState {

    @Override
    public boolean insertCard(Atm atm, User user){
        System.out.println("Thank you, for inserting card your cardId id :" + user.getCard().getCardId());
        atm.setUser(user);
        atm.setAtmState(new HasCardState());
        return true;
    }

}
