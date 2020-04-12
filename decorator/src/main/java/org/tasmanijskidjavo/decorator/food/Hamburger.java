package org.tasmanijskidjavo.decorator.food;

public class Hamburger extends Food {

    @Override
    public long getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Hamburger";
    }
}
