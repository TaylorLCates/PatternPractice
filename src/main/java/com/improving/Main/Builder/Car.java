package com.improving.Main.Builder;

public class Car {

    private final String make;
    private final String model;
    private final int year;
    private final boolean allWheelDrive;
    private final int milesPerGallon;

    private Car(CarBuilder carBuilder) {
        this.make = carBuilder.make;
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.allWheelDrive = carBuilder.allWheelDrive;
        this.milesPerGallon = carBuilder.milesPerGallon;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isAllWheelDrive() {
        return allWheelDrive;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    @Override
    public String toString() {
        return "Car: "+this.make+", "+this.model+", "+this.year+", All Wheel Drive Capable: "+this.allWheelDrive+", "+this.milesPerGallon;
    }

    public static class CarBuilder {

        private final String make;
        private final String model;
        private final int year;
        private boolean allWheelDrive;
        private int milesPerGallon;

        public CarBuilder(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public CarBuilder allWheelDrive(boolean allWheelDrive) {
            this.allWheelDrive = allWheelDrive;
            return this;
        }

        public CarBuilder milesPerGallon(int milesPerGallon) {
            this.milesPerGallon = milesPerGallon;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
