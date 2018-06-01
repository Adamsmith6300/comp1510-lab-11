/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Describes a cormorant.
 * @author adams
 * @version 1.0
 *
 */
public class Cormorant extends Bird implements Aerial, Aquatic, Terrestrial {

    /**
     * Main constructor.
     * @param age 
     * @param color 
     */
    public Cormorant(int age, String color) {
        // TODO Auto-generated constructor stub
        super(age, color);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Watch me run with my wings wide open for balance!");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("I am a great diver, watch out fish!");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("I must fly fast and low to avoid eagles!");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("Eat quickly, yum yum!");
    }

    @Override
    void move() {
        // TODO Auto-generated method stub
        run();
        swim();
        fly();
    }

}
