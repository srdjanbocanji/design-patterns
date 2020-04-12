package org.tasmanijskidjavo.decorator.food;

public class Pizza extends Food {

    @Override
    public long getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }
}
