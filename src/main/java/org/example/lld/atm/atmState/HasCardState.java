package org.example.lld.atm.atmState;

import org.example.lld.atm.Atm;
import org.example.lld.atm.Card;


public class HasCardState extends AtmState {

    @Override
    public boolean enterPin(Atm atm, int pin) {
        Card card = atm.getUser().getCard();
        if (card.getPin() != pin) {
            System.out.println("OOPS, Incorrect pin");
            atm.setAtmState(new IdleState());
            return false;
        }
        System.out.println("Thank you for entering the pin");
        atm.setAtmState(new SelectOperationState());
        return true;
    }

}
