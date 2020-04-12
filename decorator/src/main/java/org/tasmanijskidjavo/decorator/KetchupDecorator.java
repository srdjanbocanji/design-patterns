package org.tasmanijskidjavo.decorator;

import org.tasmanijskidjavo.decorator.food.Food;

public class KetchupDecorator extends Food {

    private Food food;

    public KetchupDecorator(Food food) {
        this.food = food;
    }

    @Override
    public long getCost() {
        return food.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return food.getDescription().concat(" and ketchup");
    }
}
