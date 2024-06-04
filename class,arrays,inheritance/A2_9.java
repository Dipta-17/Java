// 9. Write a java program in which you will declare an abstract class Vehicle inherits this class from two classes car
// and truck using the method engine in both display “car has good engine” and “truck has bad engine”.
import java.io.*;
import java.util.*;

abstract class Vehicle {
    
    public abstract void engine();
}

class Car extends Vehicle {
    @Override
    public void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {
    
    @Override
    public void engine() {
        System.out.println("Truck has bad engine");
    }
}
public class A2_9 {
    public static void main(String[] args) {
      
        Car car = new Car();
        Truck truck = new Truck();
        car.engine();
        truck.engine();
    }
}


















