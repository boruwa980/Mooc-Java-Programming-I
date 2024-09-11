
public class HealthStation {
    private int number;
    public HealthStation() {
    }
    

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        number++;
        return person.getWeight(); 
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings(){
        return this.number;
    } 

}
