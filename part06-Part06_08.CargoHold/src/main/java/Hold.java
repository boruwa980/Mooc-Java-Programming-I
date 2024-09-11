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

public class Hold {
    
    private int weight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int weight){
        this.weight = weight;
        this.suitcases=new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        if(totalHoldWeight()+suitcase.totalWeight()<=this.weight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalHoldWeight(){
        int localWeight = 0;
        for(Suitcase element : this.suitcases){
            localWeight+=element.totalWeight();
        }
        return localWeight;
    }

    
    public String toString(){
        return suitcases.size() + " suitcases (" + totalHoldWeight() + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    
}
