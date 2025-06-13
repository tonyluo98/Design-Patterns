package factorymethod.example1.model;

import factorymethod.example1.Dessert;

public class Brownie implements Dessert {

    @Override
    public void ovenBake(final int timeInMins) {
        System.out.println("Baking brownie for " + timeInMins + " minutes.");
    }

    @Override
    public void store(final String Location) {
        System.out.println("Storing brownie at " + Location + ".");
    }
}
