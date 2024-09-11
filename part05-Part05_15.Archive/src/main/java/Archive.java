/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
public class Archive {
    String identifier;
    String name;
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name=name;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedAsArchive = (Archive) compared;
        
        if(this.identifier.equals(comparedAsArchive.identifier)){
            return true;
        }
        
        return false;
    }
    
}
