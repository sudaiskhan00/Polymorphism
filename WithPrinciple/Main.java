/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPrinciple;

/**
 *
 * @author lenovo
 */
// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar1 = new SportsCar();  // Parent reference to child object
        Car myCar2 = new ElectricCar();

        myCar1.start(); // Calls SportsCar's start method
        myCar2.start(); // Calls ElectricCar's start method
    }
}

