package factorymethod.example1.model;

import factorymethod.example1.Dessert;
import factorymethod.example1.DessertFactory;

public class CakeFactory implements DessertFactory {

    @Override
    public Dessert createDessert() {
        return new Cake();
    }
}
