/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Animal class.
 * @author adams
 * @version 1.0
 *
 */
public abstract class Animal {
    
    /**
     * Age of the animal.
     */
    protected int age;
    /**
     * Main constructor.
     * @param age 
     */
    public Animal(int age) {
        this.age = age;
    }
    
    /**
     * Describes eating.
     */
    abstract void eat();
    /**
     * describes moving.
     */
    abstract void move();

}
