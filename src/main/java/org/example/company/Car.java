package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;  // All cars have an engine
        this.wheels = 4;     // All cars have 4 wheels
    }

    public String getName() {
        return name;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + ": the car is braking");
        return "the car is braking";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return name.equals(car.name) && cylinders == car.cylinders;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", cylinders=" + cylinders + '}';
    }
}
