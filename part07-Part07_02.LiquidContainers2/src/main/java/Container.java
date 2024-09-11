/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
public class Container {
    
    private int amountOfLiquid;
    
    public Container(){
        this.amountOfLiquid=0;
    }
    
    public int contains(){
        return amountOfLiquid;
    }
    
    public void add(int amount){
        if(amount>0){
            this.amountOfLiquid+=amount;
        }
        if(amountOfLiquid>100){
            this.amountOfLiquid=100;
        }
    }
    
    public void remove(int amount){
        if(amount>0){
            this.amountOfLiquid-=amount;
        }
        if(amountOfLiquid<0){
            this.amountOfLiquid=0;
        }   
    }
    public String toString(){
        return amountOfLiquid + "/100";
    }
    public int getValue(){
        return amountOfLiquid;
    }
}
