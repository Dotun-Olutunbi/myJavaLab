package Example_two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Player dotmann = new Player("Dotun", 22, 100,"Sword");
        System.out.println(dotmann);
        objectSaver(dotmann);
        System.out.println("--------");
        dotmann.setSkill("Sling");
        objectSaver(dotmann);
        System.out.println(dotmann);
        System.out.println("==========");
        objectLoader(dotmann);
        System.out.println(dotmann);
        ISaveable oneEye = new Monster("One-eyed Raven", 22, 100);
//        System.out.println((Monster)(oneEye.getName()));
//        System.out.println(oneEye.getStrength());
    }

    public static ArrayList<String> readValues(){
        //simulating reading from a file. Reading off lines from the console one by one.
        //returns all lines read as an arraylist
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n " +
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

    public static void objectSaver(ISaveable objectToSave){
        //the parameter here is any object that is using the ISaveable interface, not necessarily the class itself.
        //an object is passed into this object saver, and the write() method in the object already saves its state into a list. To save its state in a list
        for(int i=0; i<objectToSave.write().size(); i++){
            //the following just runs an announcement that it is saving. Mimicking a writing on disk
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void objectLoader(ISaveable objectToBeLoaded){
        //note the readValues is simulating getting the data of the object from a file, but here we are typing it in
        List<String> values = readValues();
        objectToBeLoaded.read(values);
    }
}
