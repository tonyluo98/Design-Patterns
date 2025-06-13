package factorymethod.example1.model;

import factorymethod.example1.Dessert;

class Cake implements Dessert {

    @Override
    public void ovenBake(final int timeInMins) {
        System.out.println("Baking cake for " + timeInMins + " minutes.");
    }

    @Override
    public void store(final String Location) {
        System.out.println("Storing cake at " + Location + ".");
    }
}
