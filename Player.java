/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Class to describe player.
 * @author adams
 * @version 1.0
 *
 */
public final class Player implements Comparable<Player> {
    /**
     * players name.
     */
    private final String name;
    /**
     * players team name.
     */
    private final String teamName;
    /**
     * players jersey number.
     */
    private final int jerseyNumber;
    
   /**
    * Main constructor.
    * @param name 
    * @param teamName 
    * @param jerseyNumber 
    */
   public Player(String name, String teamName, int jerseyNumber) {
       if (name != null && name.trim().length() > 0) {
           this.name = name;
       } else {
           throw new IllegalArgumentException("Must include proper name!");
       }
       if (teamName != null && teamName.trim().length() > 0) {
           this.teamName = teamName;
       } else {
           throw new IllegalArgumentException("Must include proper team name!");
       }
       if (jerseyNumber > 0) {
           this.jerseyNumber = jerseyNumber;
       } else {
           throw new IllegalArgumentException("Must include"
                   + " proper jersey number!");
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
    * ACCESSOR.
    * @return the teamName
    */
   public String getTeamName() {
       return teamName;
   }
   /**
    * ACCESSOR.
    * @return the jerseyNumber
    */
   public int getJerseyNumber() {
       return jerseyNumber;
   }


    @Override
    public int compareTo(Player p1) {
        // TODO Auto-generated method stub
        int j1 = this.getJerseyNumber();
        int j2 = p1.getJerseyNumber();
        return (j1 > j2) ? j2 : j1;
    }
    
    /**
     * returns fields as string.
     * @return the concatenated string
     */
    public String toString() {
        return "Name: " + this.getName() + "\n" 
                + "Team Name: " + this.getTeamName() + "\n"
                + "Jersey Number :" + this.getJerseyNumber();
    }
    
    /**
     * compares to Player objects.
     * @return true if they are equal
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!this.getClass().equals(other.getClass())) {
            return false;
        }
        Player p1 = (Player) other;
        return p1.getJerseyNumber() == this.getJerseyNumber() 
                && p1.getTeamName().equals(this.getTeamName()) 
                && p1.getName().equals(this.getName());
    }



   
    
    
    
    
    
}
