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
public class Room {
    
    private ArrayList<Person> peopleInTheRoom;
    
    public Room(){
        this.peopleInTheRoom = new ArrayList<>();
    }
    
    public void add(Person person){
        peopleInTheRoom.add(person);
    }
    public boolean isEmpty(){
        if(peopleInTheRoom.size()==0){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.peopleInTheRoom;
    }
    public Person shortest(){
        if(this.peopleInTheRoom.isEmpty()){
            return null;
        }
        Person comparedObject = this.peopleInTheRoom.get(0);
        
        for(Person cmpr : peopleInTheRoom){
            if(comparedObject.getHeight()>cmpr.getHeight()){
                comparedObject=cmpr;
            }
        }
        return comparedObject;
        
    }
    public Person take(){
        if(this.peopleInTheRoom.isEmpty()){
            return null;
        }
        
        Person forLater = shortest();
        
        peopleInTheRoom.remove(shortest());
        return forLater;
    }
    
}
