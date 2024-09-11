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
public class Package {
    
    private ArrayList<Gift> packageContents;
    
    public Package(){
        this.packageContents = new ArrayList<>();
    }
    public void addGift(Gift gift){
        packageContents.add(gift);
    }
    public int totalWeight(){
        int allWeight = 0;
        for(Gift content : packageContents){
            allWeight+=content.getWeight();
        }
        return allWeight;
    }
    
    
}
