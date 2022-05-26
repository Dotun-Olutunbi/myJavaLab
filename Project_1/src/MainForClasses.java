import java.util.Scanner;

public class MainForClasses {
    public static void main(String[] args) {
        Animal earthworm = new Animal(22, 1, 2, "earthworm");
        Dog GermanShepherd = new Dog(33, 44, "Jade", 22);
        GermanShepherd.eat();

        Scanner scanner = new Scanner(System.in);
        scanner.close();

    }

}
