
public class Statistics {
    private int number;
    
    private int sumOfNumbers=0;
        
    public Statistics(){
        this.number=number;
    }
    
    public void addNumber(int number){
        sumOfNumbers+=number;
        this.number++;
        
        
    }
    public int getCount(){
        return number;
    }
    public int sum(){
        
        return sumOfNumbers;
    }
    
    public double average(){
        double dzielnik = (double)this.number;
        if(dzielnik!=0){
            return sumOfNumbers/dzielnik;
        }else{
            return 0;
        }
        
        
    }
    
//    public double average(){
//        int suma = sum();
//        int ilosc = getCount();
//        double wynik = suma / ilosc;
//        return 
//    }
}
