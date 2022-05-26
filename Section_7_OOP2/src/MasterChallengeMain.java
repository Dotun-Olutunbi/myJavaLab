import java.util.Scanner;

public class MasterChallengeMain {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("What kind of burger are you ordering? \n Healthy");
        String burger = scanner.nextLine();
        switch (burger){
            case "Healthy":
                System.out.println("Healty it is!");
                ask();
                Sugar sugar = new Sugar(2);
                break;
            case "Delux":
                System.out.println("Delux it is!");
                ask();
                break;
            case "Yummy":
                System.out.println("Yummy it is!");
                ask();
                break;
        }
        scanner.close();
    }

    public static void ask(){
        boolean sugar, lettuce, carrots;
        System.out.println("Add suger? True or False");
        sugar  = scanner.nextBoolean();
        if(sugar){
            System.out.println("Add some sugar");
        }
        System.out.println("Add carrots? True or false");
        carrots = scanner.nextBoolean();
        if(carrots){
            System.out.println("Adding carrots...");
        }
        System.out.println("Add lettuce? True or false");
        lettuce = scanner.nextBoolean();
        if(lettuce){
            System.out.println("Adding lettuce ...");
        }
    }
}
