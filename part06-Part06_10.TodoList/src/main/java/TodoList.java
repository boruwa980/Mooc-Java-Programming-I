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
public class TodoList {
    private ArrayList<String> todo;
    
    public TodoList(){
        this.todo = new ArrayList<>();
    }
    
    public void add(String task){
        
        
        
        this.todo.add(task);
    }
    public void print(){
        int i=1;
        for(String task : todo){
            System.out.println(i+": " + task);
            i++;
        }
    }
    public void remove(int number){
        this.todo.remove(number-1);
    }
}
