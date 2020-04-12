package org.tasmanijskidjavo.decorator;

import org.tasmanijskidjavo.decorator.food.Food;

public class CheeseDecorator extends Food {

    private Food food;

    public CheeseDecorator(Food food) {
        this.food = food;
    }

    @Override
    public long getCost() {
        return food.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " and cheese";
    }
}
