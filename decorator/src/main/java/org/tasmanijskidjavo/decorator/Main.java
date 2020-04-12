package org.tasmanijskidjavo.decorator;

import org.tasmanijskidjavo.decorator.food.Food;
import org.tasmanijskidjavo.decorator.food.Hamburger;

public class Main {

    public static void main(String[] args) {
        Food hamburger = new Hamburger();
        hamburger = new CheeseDecorator(hamburger);
        hamburger = new KetchupDecorator(hamburger);
        hamburger = new OnionDecorator(hamburger);
        System.out.println(hamburger.getCost());
        System.out.println(hamburger.getDescription());
    }
}
