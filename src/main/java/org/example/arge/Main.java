package org.example.arge;

public class Main {
    public static void main(String[] args) {
        // Using polymorphism with the CarSkeleton reference type
        CarSkeleton gasCar = new GasPoweredCar("Ford Mustang", "A powerful gas car", 12.5, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla Model S", "A futuristic electric car", 400, 100);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "A fuel-efficient hybrid car", 18, 50, 4);

        // Testing each car's behavior
        gasCar.startEngine();
        gasCar.drive();

        electricCar.startEngine();
        electricCar.drive();

        hybridCar.startEngine();
        hybridCar.drive();

        // Printing the type of the car
        System.out.println("The type of gasCar is: " + gasCar.getClass().getSimpleName());
        System.out.println("The type of electricCar is: " + electricCar.getClass().getSimpleName());
        System.out.println("The type of hybridCar is: " + hybridCar.getClass().getSimpleName());
    }
}
