/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {
    
    private ArrayList<Recipe> recipes;
    
    public RecipeBook(){
        this.recipes=new ArrayList<>();
    }
    
    public void loadRecipesFromFile(String fileName){
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String name = scanner.nextLine();
                if(name.isEmpty()){
                    continue;
                }
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while(scanner.hasNextLine()){
                    String ingredient = scanner.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public void listRecipes(){
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            System.out.println(recipe);
        }
    }
    
    public void searchByName(String searched){
        
        for(Recipe recipe : recipes){
            if(recipe.getName().contains(searched)){
                System.out.println(recipe);
            }
        }
        
    }
    
    
    public void searchByCookingTime(int searched){
        
        for(Recipe recipe : recipes){
            if(recipe.getCookingTime() <= searched){
                System.out.println(recipe);
            }
        }

        
    }
    
    public void searchByIngredient(String searched){
        
        for(Recipe recipe : recipes){
            if(recipe.getIngredients().contains(searched)){
                System.out.println(recipe);
            }
        }
        
    }
    
}
