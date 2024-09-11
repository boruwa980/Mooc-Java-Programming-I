

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    public String toString(){
        String out = "My name is " + lastName + ", " + firstName + " " + lastName;
        return out;
    }    
}
