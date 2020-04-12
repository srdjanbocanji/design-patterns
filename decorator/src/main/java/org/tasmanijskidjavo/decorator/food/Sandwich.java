package org.tasmanijskidjavo.decorator.food;

public class Sandwich extends Food {

    @Override
    public long getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Sandwich";
    }
}
