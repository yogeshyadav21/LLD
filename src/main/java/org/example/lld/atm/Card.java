package org.example.lld.atm;

import java.time.LocalDate;
import java.util.UUID;

public class Card {

    UUID cardId;
    int pin;
    LocalDate expireDate;

    public Card(UUID cardId, int pin, LocalDate expireDate) {
        this.cardId = cardId;
        this.pin = pin;
        this.expireDate = expireDate;
    }

    public UUID getCardId() {
        return cardId;
    }

    public void setCardId(UUID cardId) {
        this.cardId = cardId;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}
