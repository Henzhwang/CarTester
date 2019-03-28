/*
 * @Henry Huang
 * Car.java
 * March 28, 2019
 * This program is designed to illstruate the objects in java.
 */

package cartester;

/**
 *
 * @author hehua8751
 */
public class Car {
    //Declare variables for future use
    private String carMake, carModel, carEngine;
    private int carYear, carPrice;
    private double carFuelCap;
    
    //Constructors
    public Car()
    {
        carMake = "BMW";
        carModel = "330";
        carEngine = "2.0L I-4 Engine";
        carYear = 2;
        carPrice = 45000;
        carFuelCap = 15.8;
    }
    
    public Car(String cMake, String cModel,String cEngine, int cYear, int cPrice, double cFuelCap)
    {
        carMake = cMake;
        carModel = cModel;
        carEngine = cEngine;
        carYear = cYear;
        carPrice = cPrice;
        carFuelCap = cFuelCap;
    }
    
    //Alternate constructor
    public Car(String cMake, String cModel, String cEngine)
    {
        carMake = cMake;
        carModel = cModel;
        carEngine = cEngine;
        carYear = (int)(Math.random()*15) + 1;
        carPrice = (int) (Math.random()*500000) +10000;
        carFuelCap = (double) Math.round(Math.random()*30) +1;
    }
    
    //Honk sound whent the car honk nicely
    public void honkNicely()
    {
        System.out.println("Bu! Bu! Bu!");
    }
    
    //Honk sound when the car honk badly
    public void honkBadly()
    {
        System.out.println("BuBu!! BuBuBuBuBuBuBu!");
    }
    
    /**
     * method to display all info for the car
     * @return car info
     */
    public String toString()
    {
        String output = "Make: " + carMake + "\n";
        output += "Model: " + carModel + "\n";
        output += "Engine: " + carEngine + "\n";
        output += "Year: " + carYear + "\n";
        output += "Price: $ " + carPrice + "\n";
        output += "Fuel Range: " + carFuelCap + "gal.";
        //output string is complete, return it
        return output;
    }
    
    
    
    
}
