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
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes=jokes;
        this.scanner=scanner;
    }
    
    public void start(){
        String userInput;
        while(true){
            System.out.println("Commands:\n" +
                            "1 - add a joke\n" +
                            "2 - draw a joke\n" +
                            "3 - list jokes\n" +
                            "X - stop");
            userInput = scanner.nextLine();
            if(userInput.equals("X")){
                break;
            }else if(userInput.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            }else if(userInput.equals("2")){
                System.out.println(jokes.drawJoke());
            }else if(userInput.equals("3")){
                jokes.printJokes();
            }
        }
    }
    
}
