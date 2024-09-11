
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String liczbaPrzed = scanner.nextLine();
            if(liczbaPrzed.equals("end")){
                break;
            }
            int liczba = Integer.valueOf(liczbaPrzed);
            System.out.println(liczba*liczba*liczba);
        }
    }
}
