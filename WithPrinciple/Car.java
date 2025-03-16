/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPrinciple;

/**
 *
 * @author lenovo
 */
// Parent class (Base class)
class Car {
    void start() {
        System.out.println("The car is starting...");
    }
}

// Child class 1 (Overriding start method)
class SportsCar extends Car {
    @Override
    void start() {
        System.out.println("The sports car starts with a loud vroom");
    }
}

// Child class 2 (Overriding start method)
class ElectricCar extends Car {
    @Override
    void start() {
        System.out.println("The electric car starts silently");
    }
}


