package org.example.lld.decorator.pizza;

public class Onion implements BasePizza{

    @Override
    public int cost() {
        return 10;
    }
}
