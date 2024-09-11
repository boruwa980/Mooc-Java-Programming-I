
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Archive inputIntoArchive = new Archive(identifier, name);
            if(!archive.contains(inputIntoArchive)){
                archive.add(inputIntoArchive);
            }
        }
        System.out.println("==Items==");
        for(Archive input : archive){
            System.out.println(input.getIdentifier() + ": " + input.getName());
        }
        

    }
}
