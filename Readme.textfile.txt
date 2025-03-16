What is Polymorphism? 
Polymorphism means "many forms." In Java OOP, it allows the same method to have different behaviors based on the object that calls it.

Example Explanation: In the first program, we have a base class Car with a start() method.
Different car types (SportsCar and ElectricCar) override the start() method with their own behavior.
This is called method overriding, a type of polymorphism.

class Car {
    void start() {
        System.out.println("The car is starting...");
    }
}


class SportsCar extends Car {
    @Override
    void start() {
        System.out.println("The sports car starts with a loud vroom");
    }
}


class ElectricCar extends Car {
    @Override
    void start() {
        System.out.println("The electric car starts silently");
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar1 = new SportsCar();  
        Car myCar2 = new ElectricCar();

        myCar1.start(); 
        myCar2.start(); 
    }
}


How Polymorphism Works in the Example?

Car myCar1 = new SportsCar();  // Parent class reference pointing to a child object
Car myCar2 = new ElectricCar();


Why is Polymorphism Useful? 
 Code Reusability: No need to rewrite start() for every new car type.
 Flexibility: We can add more car types without changing existing code.
 Method Overriding: The child class redefines the start() method from the parent class.
