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
    private Scanner scanner;
    private Point point;
    public UserInterface(Scanner scanner, Point points){
        this.scanner=scanner;
        this.point=points;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number==-1){
                System.out.println("Point average (all): " + point.average());
                System.out.println("Point average (passing): " + point.averagePassing());
                System.out.println("Pass percentage: " + point.passPercentage());
                System.out.println("Grade distribution: ");
                point.printDistribution();
                break;
            }
            point.addNumber(number);
            
        }
    }
}
