package buildermethod.example1;

import buildermethod.example1.model.Car;

public class Example1 {

    public static void main(String[] args) {
        final Car car = new Car.Builder()
                .withRadio(true)
                .withWheels(4)
                .withWindows(6)
                .build();
    }

}
