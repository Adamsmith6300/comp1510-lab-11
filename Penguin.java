/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Penguin class.
 * @author adams
 * @version 1.0
 *
 */
public class Penguin extends Bird implements Aquatic, Terrestrial {

    /**
     * Main constructor.
     * @param age 
     * @param color 
     */
    public Penguin(int age, String color) {
        // TODO Auto-generated constructor stub
        super(age, color);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Waddle, waddle, waddle!");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("Splash!");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("I love oily nutritious fish!");
    }

    @Override
    void move() {
        // TODO Auto-generated method stub
        run();
        swim();
    }

}
