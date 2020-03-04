/* Assignment 3
 * Captain extends UltimatePlayer, which extends Person
 * Will use methods and constructors from UltimatePlayer and Person classes
 * Identifies the player as captain of offense or defense
 * Variable to identify capatian type is boolean, true for offense, false for defense
 */

package Term2.Assignment3;

public class Captain extends UltimatePlayer {
    // Variables
    private boolean type;

    // Constructors
    // Sets type of Captain to true or false
    public Captain(String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        this.type = type;
    }

    // Methods
    // Returns toString() method from UltimatePlayer (and Person) and adds captain on new line
    public String toString() {
        return super.toString() + "\n   Captain: " + captainType();
    }

    // Determines if the type entered by the user is true, set to offense, if not, set to defense
    private String captainType() {
        if (type)
            return "offense";
        return "defense";
    }
}
