package Term2.Assignment3;

public class Coach extends Person {
    //variables
    private String role;

    // Constructors
    public Coach (String firstName, String lastName, String role){
        super(firstName, lastName);
        this.role = role;
    }

    // Methods
    public String toString(){
        return super.toString() + "\n   Role: " + role;
    }
}
