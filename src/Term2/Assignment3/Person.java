/* Assignment 3
 * Person Class
 * This class will be the parent class for UltimatePlayer and Coach classes
 * Should create a person that can be used throughout the program
 */
package Term2.Assignment3;

public class Person {
    // Variables
    private String firstName;
    private String lastName;

    // Constructor
    // Sets firstName and lastName to be used throughout the program
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Returns lastName, firstName on 1 line
    public String toString() {
        return lastName + ", " + firstName;
    }
}
