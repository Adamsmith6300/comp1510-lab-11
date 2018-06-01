/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Bird subclass of Animal.
 * @author adams
 * @version 1.0
 *
 */
public abstract class Bird extends Animal {

    /**
     * feather colour.
     */
    private String featherColour;
    
    /**
     * Main constructor.
     * @param age 
     * @param color 
     */
    public Bird(int age, String color) {
        super(age);
        if (color != null && color.trim().length() > 0) {
            this.setFeatherColour(color);
        }
    }

    /**
     * ACCESSOR.
     * @return the featherColour
     */
    public String getFeatherColour() {
        return featherColour;
    }

    /**
     * MUTATOR.
     * @param featherColour the featherColour to set
     */
    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

}
