package org.example.lld.splitwise;

import org.example.lld.splitwise.user.User;

public class Split {

    User user;
    int amount;
    int percentage;

    public Split(User user, int amount, int percentage) {
        this.user = user;
        this.amount = amount;
        this.percentage = percentage;
    }

    public User getUser() {
        return user;
    }

    public int getAmount() {
        return amount;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
