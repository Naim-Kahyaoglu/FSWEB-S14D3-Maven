package org.example.company;

public class Main {
    public static void main(String[] args) {
        Car mitsubishi = new Mitsubishi(6, "Mitsubishi Outlander");
        Car holden = new Holden(8, "Holden Commodore");
        Car ford = new Ford(4, "Ford Mustang");

        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        holden.startEngine();
        holden.accelerate();
        holden.brake();

        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}
