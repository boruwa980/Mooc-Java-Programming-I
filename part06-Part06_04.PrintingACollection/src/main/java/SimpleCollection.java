
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        String printOutput = "The collection " + this.name +  " has " + this.elements.size() +  " elements:\n";

        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        if(elements.size()==1){
            return "The collection " + this.name +  " has " + this.elements.size() +  " element:\n" + elements.get(0);
        }
        
        String elem="";
        
        for(String element : elements){
            elem = elem + element + "\n";
        }
        
        
        
        return printOutput + elem;
        
    }
}
