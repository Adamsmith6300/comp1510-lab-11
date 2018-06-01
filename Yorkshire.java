/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Yorky class.
 * @author adams
 *@version 1.0
 */
public class Yorkshire extends Dog {

    /**
     * yorkyweight.
     */
    public static final int YORKSHIRE_WEIGHT = 4;
    /**
     * true if this yorky catches rats.
     */
    private boolean ratter;
    
    /**
     * Main constructor.
     * @param name the yorkies name
     * @param isRatter 
     */
    public Yorkshire(String name, boolean isRatter) {
        super(name);
        this.ratter = isRatter;
    }

    /**
     * ACCESSOR.
     * @return the ratter
     */
    public boolean isRatter() {
        return ratter;
    }

    /**
     * MUTATOR.
     * @param ratter the ratter to set
     */
    public void setRatter(boolean ratter) {
        this.ratter = ratter;
    }

    @Override
    double averageBreedWeightKG() {
        // TODO Auto-generated method stub
        return (double) YORKSHIRE_WEIGHT;
    }
    
    /**
     * Overridden method for woof.
     * @return Bow WOW
     */
    public String speak() {
        return "YAPYAPYAP";
    }
    /**
     * overridden toString.
     * @return the fields as string
     */
    public String toString() {
        return this.name + " " + this.ratter;
    }

    /**
     * compares two yorkies.
     * @param other the other yorkies
     * @return true if their names and ratter status are equal
     */
    public boolean equals(Labrador other) {
        return this.toString().equals(other.toString());
    }

}
