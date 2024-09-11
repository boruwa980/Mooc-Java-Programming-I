
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("First name:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Last name:");
            String surName = scanner.nextLine();
            System.out.print("Identification number:");
            String id = scanner.nextLine();
                
            infoCollection.add(new PersonalInformation(name, surName, id));
            
            
        }
        System.out.println("");
        for(PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
        
        
        scanner.close();

    }
}
