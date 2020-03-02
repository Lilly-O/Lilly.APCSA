package Term2.Assignment3;

public class Captain extends UltimatePlayer {
    // Variables
    private boolean type;

    // Constructors
    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        this.type = type;
    }

    // Methods
    public String toString(){
        return super.toString() + "\n   Captain: " + captainType();
    }

    private String captainType(){
        if(type)
            return "offense";
        return "defense";
    }
}
