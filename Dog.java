/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Abstract dog class.
 * @author adams
 * @version 1.0
 *
 */
public abstract class Dog {
    
   /**
    * the dogs name.
    */
   protected String name;
   /**
    * Main constructor.
    * @param name 
    */
   public Dog(String name) {
       if (name != null && name.trim().length() > 0) {
           this.name = name;
       }
   }
   
   /**
    * ACCESSOR.
    * @return the name
    */
   public String getName() {
       return name;
   }
   /**
    * Dog says woof.
    * @return woof string
    */
   public String speak() {
       return "WOOF!";
   }
   /**
    * average breed weight in kg.
    * @return weight as double
    */
   abstract double averageBreedWeightKG();
   /**
    * this dogs fields.
    * @return fields as string
    */
   public String toString() {
       return this.name;
   }
   /**
    * compares 2 dogs names.
    * @param other the other dog
    * @return true if theyre equal
    */
   public boolean equals(Dog other) {
       if (this.getName().equals(other.getName())) {
           return true;
       }
       return false;
   }
}
