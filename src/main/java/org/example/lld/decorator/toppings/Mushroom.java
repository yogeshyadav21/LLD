package org.example.lld.decorator.toppings;

import org.example.lld.decorator.pizza.BasePizza;

public class Mushroom implements Toppings{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
