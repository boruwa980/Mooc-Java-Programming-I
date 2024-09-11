
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command;
        int value=0;
        int numeratorFirst=0;
        int numeratorSecond=0;
        while (true) {
            System.out.println("First: "+ numeratorFirst + "/100\n" +
                                "Second: " + numeratorSecond + "/100");
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            command = parts[0];
            value = Integer.valueOf(parts[1]);
            if(command.equals("add") && value>0){
                numeratorFirst+=value;
                if(numeratorFirst>100){
                    numeratorFirst=100;
                }
            }else if(command.equals("move") && value>0){
                
                if(value==100){
                    numeratorSecond=100;
                    numeratorFirst -= value;
                }else if(numeratorFirst<value ){
                    numeratorSecond+=numeratorFirst;
                    if(numeratorSecond>100){
                        numeratorSecond=100;
                    }
                    numeratorFirst=0;
                }else{
                    numeratorFirst -= value;
                    numeratorSecond += value;
                }
                
                if(numeratorSecond>100){
                    numeratorSecond=100;
                }
                
                
            }else if(command.equals("remove") && value>0){
                numeratorSecond-=value;
                if(numeratorSecond<0){
                    numeratorSecond = 0;
                }
            }
            System.out.println("");
        }
    }
//add 30
//move 20
//remove 15
//quit
}
