
// Add items to grocery list
// Remove items from grocery list

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrcoeryList {
    public static void main(String[] args) {
        // Run main code here
        GroceryStore storeObj = new GroceryStore();
        Scanner scannerObj = new Scanner(System.in);
        boolean exit = false;

        // Menu -- List all options
        // Perform based on options selected 
        // Keep in a loop until program exits
        while(!exit){
            System.out.println("\nGrocery List Menu");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. View the list");
            System.out.println("4. Clear the list");
            System.out.println("5. Exit program");
            System.out.println("Choose an option ");
            int choice = scannerObj.nextInt();
            scannerObj.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter the item to add: ");
                    String item = scannerObj.nextLine();
                    storeObj.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    item = scannerObj.nextLine();
                    storeObj.removeItem(item);
                    break;
                case 3:
                    storeObj.viewList();
                    break;
                case 4:
                    storeObj.clearList();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        scannerObj.close();
        
    }
}

// Running the main functionalities
class GroceryStore{
    // Class Attribute
    public List<String> groceryList;

    // Constructor Method (initilization function)
    public GroceryStore(){
        this.groceryList = new ArrayList<>();
    }

    public void addItem(String item){
        String itemLowered = item.toLowerCase();
        groceryList.add(itemLowered);
        System.out.println(itemLowered + " added to the grocery list");
    }

    public void removeItem(String item){
        String itemLowered = item.toLowerCase();
        if(groceryList.remove(itemLowered)){
            System.out.println(itemLowered + " removed from the grocery list");
        }
        else{
            System.out.println(itemLowered + " not found in the grocery list");
        }
    }

    public void viewList(){
        if(groceryList.isEmpty()){
            System.out.println("Your grocery list is empty");
        }
        else{
            System.out.println("Grocery List: ");
            for(int i = 0; i < groceryList.size(); i++){
                System.out.println((i+1) + ". " + groceryList.get(i));
            }
        } 
    }

    public void clearList(){
        groceryList.clear();
        System.out.println("The grocery list has been cleared");
    }

    

}

