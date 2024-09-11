
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        
        int newMoneyEuros = this.euros + addition.euros();
        int newMoneyCents = this.cents()+ addition.cents();
        
        
        
        Money newMoney = new Money(newMoneyEuros, newMoneyCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros==compared.euros && this.cents<compared.cents){
            return true;
        }else{
            return false;
        }
        
        
    }
    
    
    public Money minus(Money decreaser){
        int newMoneyEuros=this.euros;
        int newMoneyCents=this.cents;
        if(decreaser.cents>0){
            newMoneyEuros-=1;
            newMoneyCents=100-decreaser.cents;
        }
        newMoneyEuros-=decreaser.euros;
        
        Money newMoney = new Money(newMoneyEuros, newMoneyCents);
        Money moneyZero = new Money(0,0);
        
        if(newMoney.lessThan(moneyZero)){
            return moneyZero;  
        }
        
        return newMoney;
    }
    

}
