package org.tasmanijskidjavo.decorator;

import org.tasmanijskidjavo.decorator.food.Food;

public class OnionDecorator extends Food {

    private Food food;

    public OnionDecorator(Food food) {
        this.food = food;
    }

    @Override
    public long getCost() {
        return food.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return food.getDescription().concat(" and onions");
    }
}
