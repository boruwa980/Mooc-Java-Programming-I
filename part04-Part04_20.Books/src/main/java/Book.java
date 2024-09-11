/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
public class Book {
    private String title;
    private int pages;
    private int age;
    
    public Book(String title, int pages, int age){
        this.title=title;
        this.pages=pages;
        this.age=age;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYear(){
        return this.age;
    }
    public String toString(){
        return (this.title + ", " + this.pages + " pages, " + this.age);
    }
    
}
