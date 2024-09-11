/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
public class Bird {
    private String englishName;
    private String latinName;
    private int observed;
    
    
    public Bird(String englishName, String latinName, int observed){
        this.englishName = englishName;
        this.latinName = latinName;
        this.observed = observed;
    }
    
    public String getEnglishName(){
        return this.englishName;
    }
    
    public String latinName(){
        return this.latinName;
    }
    
    public int observed(){
        return this.observed;
    }
    
    public String toString(){
        return this.englishName + " (" + this.latinName + "): " + observed + " observations"; 
    }
    
    public void increseObserve(){
        observed++;
    }
    
}
