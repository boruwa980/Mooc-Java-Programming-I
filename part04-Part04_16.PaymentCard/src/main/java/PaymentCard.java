/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
public class PaymentCard {
    private double balance;
    public PaymentCard(double openingBalance){
        this.balance=openingBalance;
    }
    public String toString(){
        String ret = "The card has a balance of " + this.balance + " euros";
        return ret;
        
        
    }
    
    public void eatAffordably() {
        // write code here
        if(this.balance>=2.60){
            this.balance=this.balance-2.60;

        }
            
    }

    public void eatHeartily() {
        // write code here
        if(this.balance>=4.60){
            this.balance=this.balance-4.60;

        }    
    }
    public void addMoney(double amount) {
    // write code here
        if(amount<0){
            this.balance=this.balance;
        }
    
        if(this.balance+amount<=150 && amount>=0){
            this.balance+=amount;
        }else if(this.balance+amount>150){
            this.balance=150;
        }
    }

    
    

    
}
