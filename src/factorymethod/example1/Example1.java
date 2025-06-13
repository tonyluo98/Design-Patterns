package factorymethod.example1;

import factorymethod.example1.model.BrownieFactory;
import factorymethod.example1.model.CakeFactory;

public class Example1 {

    public static void main(String[] args) {
        DessertFactory cakeFactory = new CakeFactory();
        Dessert cake = cakeFactory.createDessert();
        cake.ovenBake(20);
        cake.store("Fridge");

        DessertFactory brownieFactory = new BrownieFactory();
        Dessert brownie = brownieFactory.createDessert();
        brownie.ovenBake(15);
        brownie.store("On table counter");
    }

}