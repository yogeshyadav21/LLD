package org.example.lld.decorator.pizza;

public class Farmhouse implements BasePizza{

    @Override
    public int cost() {
        return 30;
    }
}
