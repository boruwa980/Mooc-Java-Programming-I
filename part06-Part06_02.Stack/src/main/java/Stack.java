/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    
    public boolean isEmpty(){
        if(stacks.size()==0){
            return true;
        }
        return false;
    }
    public void add(String value){
        
        stacks.add(0,value);
        
    }
    
    public ArrayList<String> values(){
        return stacks;
    }
    public String take(){
        String lastElement=stacks.get(0);
        stacks.remove(0);
        return lastElement;
    }
    
}
