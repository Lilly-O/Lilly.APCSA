/* Assignment 3
 * Coach class extends parent class, Person
 * Constructor will accept user input identifying role of person
 */

package Term2.Assignment3;

public class Coach extends Person {
    //variables
    private String role;

    // Constructors
    // Sets role to Person
    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    // Methods
    // Returns toString() from Person class and adds role on new line
    public String toString() {
        return super.toString() + "\n   Role: " + role;
    }
}
