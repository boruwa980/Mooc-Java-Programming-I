/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
public class Gauge {
    private int value;
    public Gauge(){
        value=0;
    }
    public void increase(){
        if(value<5){
            value++;
        }else{
            value=5;
        }
            
    }
    public void decrease(){
        if(value>0){
            value--;
        }else{
            value=0;
        }
    }
    public int value(){
        return value;
    }
    public boolean full(){
        if(value==5){
            return true;
        }else{
            return false;
        }
    }
}
