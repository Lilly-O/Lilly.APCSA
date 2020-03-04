/* Assignment 3
 * UltimatePlayer class can/will use methods from parent class, Person
 * Records the position and jersey number of players
 * Returns person, position, and jersey number
 */
package Term2.Assignment3;

public class UltimatePlayer extends Person {
    // Variables
    private int jerseyNumber;
    private String position;
    // Counter variable to create a Jersey Number for player
    private static int jerseyNumberCounter = 0;

    // Constructors
    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        if (position.equals("cutter")) // Only two position options
            this.position = "cutter";
        else
            this.position = "handler"; // Will set to handler if cutter is not read
        jerseyNumberCounter++; // Increases count for every person that enters this constructor
        jerseyNumber = jerseyNumberCounter; // Sets Jersey Number for player (Person)
    }

    //Methods
    // Gets the position of the player
    public String getPosition() {
        return position;
    }

    // Return toString method from Person as well as position and jersey number
    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }
}
