/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Compares players.
 * @author adams
 * @version 1.0
 *
 */
public class ComparePlayers {

    /**
     * Drives the program.
     * @param args 
     */
    public static void main(String[] args) {
        final int twotwo = 22;
        Player[] players = new Player[2];
        try {
            Player p1 = new Player(" ", "Ottawa", twotwo);
            System.out.println(p1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            Player p2 = new Player("John", " ", twotwo);
            System.out.println(p2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            Player p3 = new Player("John", "Ottawa", 0);
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Player " + (i + 1) + "; Input a Name: ");
            String name = scan.nextLine();
            System.out.println("Input a team Name: ");
            String teamName = scan.nextLine();
            System.out.println("And a jersey number: ");
            int jerseyNumber = scan.nextInt();
            Player p4 = new Player(name, teamName, jerseyNumber);
            players[i] = p4;
            scan.nextLine();
        }
        System.out.println(players[0].compareTo(players[1]));
        System.out.println(players[0].equals(players[1]));
        scan.close();
    }

}
