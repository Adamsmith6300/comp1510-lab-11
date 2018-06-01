/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Tests the dog classes.
 * @author adams
 * @version 1.0
 *
 */
public class DogTest {

    /**
     * Main constructor.
     * @param args 
     * 
     */
    public static void main(String[] args) {
        Labrador hannah = new Labrador("Hannah", "golden");
        String s = hannah.toString() + " " + hannah.speak() 
        + " " + Labrador.LABRADOR_WEIGHT;
        System.out.println(s);
        Yorkshire seb = new Yorkshire("Sebastian", true);
        String t = seb.toString() + " " + seb.speak() 
        + " " + Yorkshire.YORKSHIRE_WEIGHT;
        System.out.println(t);
    }

}
