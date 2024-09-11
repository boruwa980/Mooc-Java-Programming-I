
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count=0;
        int wins=0;
        int loses=0;
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                String parts[] = line.split(",");
                if(parts[0].equals(team)){
                    count++;
                    if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                        wins++;
                    }else{
                        loses++;
                    }
                }
                if(parts[1].equals(team)){
                    count++;
                    if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                        wins++;
                    }else{
                        loses++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: "+ wins);
            System.out.println("Losses: " + loses);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
