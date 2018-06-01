/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Labrador class extension of dog class.
 * @author adams
 * @version 1.0
 *
 */
public class Labrador extends Dog {
    
    /**
     * constant for labrador weight.
     */
    public static final int LABRADOR_WEIGHT = 35;

    /**
     * this labradors color.
     */
    private String color;
  
    /**
     * Main constructor.
     * @param name 
     * @param color 
     */
    public Labrador(String name, String color) {
        super(name);
        if (color != null && color.trim().length() > 0) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Must have proper color!");
        }
        
    }

    /**
     * ACCESSOR.
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * MUTATOR.
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * returns average weight of breed.
     * @return weight in kg as double
     */
    @Override
    double averageBreedWeightKG() {
        // TODO Auto-generated method stub
        return (double) LABRADOR_WEIGHT;
    }
    
    /**
     * Overridden method for woof.
     * @return Bow WOW
     */
    public String speak() {
        return "BOW WOW";
    }
    /**
     * overridden toString.
     * @return the fields as string
     */
    public String toString() {
        return this.name + " " + this.color;
    }

    /**
     * compares two labradors.
     * @param other the other labrador
     * @return true if their names and color are equal
     */
    public boolean equals(Labrador other) {
        return this.toString().equals(other.toString());
    }
    
    
    
}
