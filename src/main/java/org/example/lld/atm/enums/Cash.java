package org.example.lld.atm.enums;

public enum Cash {
    TWO_THOUSAND(2000),
    FIVE_HUNDRED(500),
    ONE_HUNDRED(100);

    private final int value;

    Cash(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
