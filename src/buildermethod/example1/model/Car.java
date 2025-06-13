package buildermethod.example1.model;

public class Car {

    private int windows;
    private int wheels;
    private boolean trunk;
    private boolean radio;

    public Car(Builder builder) {
        this.windows = builder.windows;
        this.wheels = builder.wheels;
        this.trunk = builder.trunk;
        this.radio = builder.radio;
    }

    public int getWindows() {
        return windows;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public boolean isRadio() {
        return radio;
    }

    public static class Builder {
        private int windows;
        private int wheels;
        private boolean trunk;
        private boolean radio;

        public Builder create() {
            return new Builder();
        }

        public Builder withWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder withWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder withTrunk(boolean trunk) {
            this.trunk = trunk;
            return this;
        }

        public Builder withRadio(boolean radio) {
            this.radio = radio;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
