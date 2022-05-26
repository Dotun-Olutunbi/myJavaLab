import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){

    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() + " elements in the grocery list.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String replaceableItem, String newItem){
        if(groceryList.contains(replaceableItem)){
           int position = groceryList.indexOf(replaceableItem);
            groceryList.set(position, newItem);
        }
        else{
            System.out.println(replaceableItem + " is not in the grocery list");
        }
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item){
        groceryList.remove(item);
    }

    public boolean checkGroceryItem(String item){
        return groceryList.contains(item);
    }



//    Other methods are: indexOf(int), contains(boolean)
}
