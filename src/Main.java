public class Main {

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

    interface Dessert {
        void ovenBake(final int timeInMins);
        void store(final String location);
    }

    static class Cake implements Dessert {

        @Override
        public void ovenBake(final int timeInMins) {
            System.out.println("Baking cake for " + timeInMins + " minutes.");
        }

        @Override
        public void store(final String Location) {
            System.out.println("Storing cake at " + Location + ".");
        }
    }

    static class Brownie implements Dessert {

        @Override
        public void ovenBake(final int timeInMins) {
            System.out.println("Baking brownie for " + timeInMins + " minutes.");
        }

        @Override
        public void store(final String Location) {
            System.out.println("Storing brownie at " + Location + ".");
        }
    }

    interface DessertFactory {

        Dessert createDessert();
    }

    static class CakeFactory implements DessertFactory {

        @Override
        public Dessert createDessert() {
            return new Cake();
        }
    }

    static class BrownieFactory implements DessertFactory {

        @Override
        public Dessert createDessert() {
            return new Brownie();
        }
    }
}