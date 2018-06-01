/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Defines an ostrich.
 * @author adams
 * @version 1.0
 *
 */
public class Ostrich extends Bird implements Terrestrial {

    /**
     * Main constructor.
     * @param age 
     * @param featherColour 
     */
    public Ostrich(int age, String featherColour) {
        super(age, featherColour);
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("Watch me gobble up these lizards yum yum!");
    }

    @Override
    void move() {
        // TODO Auto-generated method stub
        run();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Look how fast I lope across the savannah!");
    }

}
