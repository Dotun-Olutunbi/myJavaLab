package Example_two;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadValues {
    public static ArrayList<String> readValues(){
        //simulating reading from a file. Reading off lines from the console one by one.
        //returns all lines read as an arraylist
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose an option" +
                "1 to etner " +
                "0 to quit");
        while(!quit){
            System.out.println( "Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Ënter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
