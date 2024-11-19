package org.example.lld.splitwise.balanceSheet;

public class Balance {
    int amountOwe;
    int amountGet;

    public Balance() {
        this.amountOwe = 0;
        this.amountGet = 0;
    }

    public int getAmountOwe() {
        return amountOwe;
    }

    public void addAmountOwe(int amountOwe) {
        this.amountOwe += amountOwe;
    }

    public int getAmountGet() {
        return amountGet;
    }

    public void addAmountGet(int amountGet) {
        this.amountGet += amountGet;
    }


    @Override
    public String toString() {
        return "Balance{" +
                "amountOwe=" + amountOwe +
                ", amountGet=" + amountGet +
                '}';
    }
}
