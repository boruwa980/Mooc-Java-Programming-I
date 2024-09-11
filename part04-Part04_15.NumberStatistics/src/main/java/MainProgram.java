import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        int licznik=0;
        int licznikEven=0;
        int licznikOdd=0;
        
        
        Statistics totalStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        
 //       Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
     //   System.out.println("Count: " + statistics.getCount());

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        //System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        while(true){
                        
            String x = scanner.nextLine();
            
            int number= Integer.valueOf(x);
            
            
            
            if(number==-1){
                break;
            }
            totalStatistics.addNumber(number);
            if(number%2==0){
                evenStatistics.addNumber(number);
            }else{
                oddStatistics.addNumber(number);
            }
            
        }
        System.out.println("Sum: " + totalStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
        

    }
}
