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
public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner=scanner;
    }
    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if (command.equals("list")) {
                todoList.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskNumber = Integer.parseInt(scanner.nextLine());
                todoList.remove(taskNumber);
            }

    }
    }
//    public void add(){
//        System.out.print("To add: ");
//        String task = scanner.next();
//        todoList.add(task);
//    }
    
    
    
}


