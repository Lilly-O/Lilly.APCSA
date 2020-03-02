package Term2.Assignment3;

public class UltimatePlayer extends Person {
    // Variables
    private int jerseyNumber;
    private String position;
    private static int jerseyNumberCounter = 0;

    // Constructors
    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        if(position.equals("cutter"))
            this.position = "cutter";
        else
            this.position = "handler";
        jerseyNumberCounter++;
        jerseyNumber = jerseyNumberCounter;
    }

    //Methods
    public String getPosition() {
        return position;
    }

    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }
}
