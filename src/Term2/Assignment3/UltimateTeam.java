/* Assignment 3
 * UltimateTeam does not extend any classes
 * Creates ArrayLists of players and coaches separated
 * Can retrieve players by position
 */
package Term2.Assignment3;

import java.util.ArrayList;

public class UltimateTeam {
    // Variables
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    // Constructors
    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;

    }

    // Methods
    public String getCutters() {
        return getPlayersByPosition("cutter");
    }

    public String getHandlers() {
        return getPlayersByPosition("handler");
    }

    // Returns the list of all the coaches and players
    public String toString() {
        String s = "COACHES\n";
        for (Coach coach : coaches)
            s += coach + "\n";
        s += "\nPLAYERS\n";
        for (UltimatePlayer player : players)
            s += player + "\n";
        return s;
    }

    //Method goes through for loop to cycle through array, scanning for positions to return to the user
    private String getPlayersByPosition(String position) {
        String s = "";
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals(position))
                s += player + "\n";
        }
        return s;
    }


}