/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary object;
    public TextUI(Scanner scanner, SimpleDictionary object){
        this.scanner = scanner;
        this.object = object;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.next();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                add();
            }else if(command.equals("search")){
                System.out.println(search());
            }else{
                System.out.println("Unknown command");
            }
        }
    }
    
    public String search(){
        System.out.print("To be translated: ");
        String toTranslate = scanner.next();
        if(object.contains(toTranslate)){
            System.out.print("Translation: ");
            return object.translate(toTranslate);
        }
        
        return "Word " + toTranslate + " was not found";
        
        
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = this.scanner.next();
        System.out.print("Translation: ");
        String translation = this.scanner.next();
        this.object.add(word, translation);
    }
    
}
