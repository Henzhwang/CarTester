/*
 * @Henry Huang
 * CarTester.java
 * March 28, 2019
 * This program is designed to display the info od car, such as its make, model,
 * its engine, year, price and fuel tank capaticy
 */

package cartester;

/**
 *
 * @author hehua8751
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing constructors
        Car car1 = new Car("Lamborghini", "Gallardo LP550-2", "Odd firing 5.2 L V10", 6, 181900, 23.8);
        Car car2 = new Car("Toyota", "86", "2.0LH-4");
        Car car3 = new Car();
        
        //Displaying constructors
        System.out.println(car1.toString());
        System.out.println("--------------------------------");
        
        System.out.println(car2.toString());
        System.out.println("--------------------------------");
        
        System.out.println(car3.toString());
        System.out.println("--------------------------------");
        
        //Display honk sounds
        car1.honkNicely();
        car2.honkBadly();
    }
    
}
