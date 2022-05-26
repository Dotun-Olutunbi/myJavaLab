import java.util.Scanner;

public class ArrayListMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       GroceryList myGroceryList = new GroceryList();

        myGroceryList.addGroceryItem("Fish");
        myGroceryList.addGroceryItem("Potatoes");
        myGroceryList.addGroceryItem("Apples");
        myGroceryList.addGroceryItem("Oranges");
        myGroceryList.addGroceryItem("Cocoa-cola");
        myGroceryList.printGroceryList();
        System.out.println("--------------");
     System.out.println("Removing Apples now");
        myGroceryList.removeGroceryItem("Apples");
     System.out.println("Removing item previously at position 1");
        myGroceryList.removeGroceryItem(1);
        myGroceryList.printGroceryList();
        System.out.println(myGroceryList.checkGroceryItem("Oranges"));
        myGroceryList.modifyGroceryItem("Coco-cola", "Mangoes"); //what does this do?
        myGroceryList.modifyGroceryItem("Cocoa-cola", "Mangoes"); //what does this do?
     System.out.println("-----------------");
        myGroceryList.printGroceryList();
        System.out.println("------------");
        myGroceryList.removeGroceryItem(1);
        myGroceryList.printGroceryList();
    }
}
