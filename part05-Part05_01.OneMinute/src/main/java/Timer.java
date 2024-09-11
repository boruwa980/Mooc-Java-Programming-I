
public class Timer {
    private int value;
    private int houndretsLimit=100;
    private int secValue=0;
    
    public Timer(){
        this.value=0;
    }
    
    public String toString(){
        if(secValue<10 && this.value<10){
            return "0" + this.secValue + ":0" + this.value;
        }else if(secValue<10 && this.value>10){
            return "0" + this.secValue + ":" + this.value;
        }else if(secValue>10 && this.value<10){
            return "0" + this.secValue + ":0" + this.value;
        }
        
        return this.secValue + ":" + this.value;
    }
    
    public void advance(){
        this.value = this.value + 1;

        if (this.value >= this.houndretsLimit) {
            this.value = 0;
            this.secValue++;
            if(this.secValue==60){
                this.secValue=0;
            }
        }

    }
}
