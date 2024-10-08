import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count=0;
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            
            while(scan.hasNextLine()){
                int row = Integer.valueOf(scan.nextLine());
                if(row>=lowerBound && row<=upperBound){
                    count++;
                }
            }
            System.out.print("Numbers: " + count);  
        }catch(Exception e){
            System.out.print("Error: " + e.getMessage());
        }
        

    }

}
