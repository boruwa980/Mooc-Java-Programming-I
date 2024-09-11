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
import java.util.ArrayList;
public class BirdAlbum {
    private ArrayList<Bird> birds;
    private Scanner scanner;
    public BirdAlbum(Scanner scanner){
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void addBird(){
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();
        Bird bird = new Bird(name, latinName, 0);
        
        
        this.birds.add(bird);
    }
    
    public void printAll(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public void addObservation(){
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        for(Bird bird : birds){
            if(bird.getEnglishName().equals(name)){
                bird.increseObserve();
            }
        }
        
    }
    
    public void one(){
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        for(Bird bird : birds){
            if(bird.getEnglishName().equals(name)){
                System.out.println(bird.toString());
            }
        }
        
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String command = scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }else if(command.equals("Add")){
                addBird();
            }else if(command.equals("All")){
                printAll();
            }else if(command.equals("Observation")){
                addObservation();
            }else if(command.equals("One")){
                one();
            }else{
                System.out.println("There is no such command");
            }
            
        }
    }
    
    
}
