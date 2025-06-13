package factorymethod.example1.model;

import factorymethod.example1.Dessert;
import factorymethod.example1.DessertFactory;

public class BrownieFactory implements DessertFactory {

    @Override
    public Dessert createDessert() {
        return new Brownie();
    }
}
