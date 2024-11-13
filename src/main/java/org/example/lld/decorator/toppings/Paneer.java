package org.example.lld.decorator.toppings;

import org.example.lld.decorator.pizza.BasePizza;

public class Paneer implements Toppings{

    BasePizza basePizza;

    public Paneer(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
