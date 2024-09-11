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
import java.nio.file.Paths;

public interface NewInterface {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(Paths.get("dane.txt"))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
