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

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> itemsInTheSuitcase;
    
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.itemsInTheSuitcase = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int totalWeight=0;
        for(Item element : this.itemsInTheSuitcase){
            totalWeight+=element.getWeight();
        }
        if(!(totalWeight+item.getWeight()>this.maxWeight)){
            this.itemsInTheSuitcase.add(item);
        }
    }
    
    public String toString(){
        
        if(this.itemsInTheSuitcase.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.itemsInTheSuitcase.size()==1){
            return "1 item (" + itemsInTheSuitcase.get(0).getWeight() + " kg)";
        }
        
        int totalWeight=0;
        for(Item element : this.itemsInTheSuitcase){
            totalWeight+=element.getWeight();
        }
        
        return this.itemsInTheSuitcase.size() + " items (" + totalWeight + " kg)";
    }
    public void printItems(){
        for(Item element : this.itemsInTheSuitcase){
            System.out.println(element.toString());
        }
    }
    public int totalWeight(){
        int localWeight = 0;
        for(Item element : this.itemsInTheSuitcase){
            localWeight+=element.getWeight();
        }
        return localWeight;
    }
    public Item heaviestItem(){
        if(this.itemsInTheSuitcase.isEmpty()){
            return null;
        }
        
        Item comparedItem = this.itemsInTheSuitcase.get(0);
        
        for(Item cmprd : this.itemsInTheSuitcase){
            if(comparedItem.getWeight()<cmprd.getWeight()){
                comparedItem = cmprd;
            }
        }
        return comparedItem;
    }
    
    
}
