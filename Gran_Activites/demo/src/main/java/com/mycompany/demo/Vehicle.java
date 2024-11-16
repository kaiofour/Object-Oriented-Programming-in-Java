package com.mycompany.demo;

/**
 *
 * @author Russel
 */
public class Vehicle {
    private int topSpeed;     // This is how fast the car can go at max
    private int currSpeed;    // This keeps track of how fast the car is going right now
    private String color;     // The color of the car
    private String model;     // The car model name
    private String manufacturer; // The company that made the car
    private String plateNumber;  // The license plate of the car

    // Constructor to create a new Vehicle object with some details
    public Vehicle(int topSpeed, String color, String model, String manufacturer, String plateNumber) {
        this.topSpeed = topSpeed;   // Set the top speed for the car
        this.currSpeed = 0;         // Car starts at 0 speed
        this.color = color;         // Set the color
        this.model = model;         // Set the model
        this.manufacturer = manufacturer; // Set the manufacturer
        this.plateNumber = plateNumber;   // Set the plate number
    }

    // This method makes the car go faster, but only if it's not at top speed
    public boolean accelerate() {
        if (currSpeed < topSpeed) {
            currSpeed += 10; // Increase speed by 10
            return true;     // It worked
        }
        return false;        // Can't go faster if at top speed
    }

    // This method slows the car down, but it can't go slower than 0
    public boolean decelerate() {
        if (currSpeed > 0) {
            currSpeed -= 10; // Decrease speed by 10
            return true;     // It worked
        }
        return false;        // Can't decelerate if already at 0 speed
    }

    // This method prints out the details of the car
    public String toString() {
        return "Vehicle{" +
                "Top Speed=" + topSpeed + " km/h" +
                ", Current Speed=" + currSpeed + " km/h" +
                ", Color='" + color + '\'' +
                ", Model='" + model + '\'' +
                ", Manufacturer='" + manufacturer + '\'' +
                ", Plate Number='" + plateNumber + '\'' +
                '}';
    }

    // This is where we test everything in the main method
    public static void main(String[] args) {
        // Creating a new car (vehicle) with some random details
        Vehicle myCar = new Vehicle(180, "Red", "Model S", "Tesla", "ABC-1234");

        // Printing the details of the car before we do anything
        System.out.println("Initial state of the vehicle: " + myCar);

        // Let's make the car go faster 3 times
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        
        // Printing the details after speeding up
        System.out.println("After accelerating: " + myCar);

        // Now let's slow the car down 2 times
        myCar.decelerate();
        myCar.decelerate();

        // Printing the details after slowing down
        System.out.println("After decelerating: " + myCar);
    }
}
