/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Tests the bird classes.
 * @author adams
 * @version 1.0
 *
 */
public class BirdFarm {

    /**
     * Main constructor.
     * @param args 
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final int twentyTwo = 22;
        final int ten = 10;
        final int thirtyTwo = 32;
        Ostrich o = new Ostrich(twentyTwo, "brown");
        Penguin p = new Penguin(ten, "black");
        Cormorant c = new Cormorant(thirtyTwo, "grey");
        o.move();
        p.move();
        c.move();
    }

}
