import java.util.Scanner;

public class UserInterface {
    private RecipeBook recipeBook;
    private Scanner scanner;

    public UserInterface(RecipeBook recipeBook, Scanner scanner) {
        this.recipeBook = recipeBook;
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        recipeBook.loadRecipesFromFile(fileName);

        System.out.println("\nCommands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                recipeBook.listRecipes();
            }else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searched = scanner.nextLine();
       
                recipeBook.searchByName(searched);
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                recipeBook.searchByCookingTime(time);
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                recipeBook.searchByIngredient(ingredient);
            }
            else {
                System.out.println("Unknown command");
            }
            
            
        }
    }
}