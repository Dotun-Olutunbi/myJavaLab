package AbstractStuff;

public class MainAbstract {
    public static void main(String[] args) {
        Dog bingo = new Dog("Bingo");
        bingo.breathe();
        bingo.eat();

        Bird parrot = new Parrot("african parrot");
        parrot.fly();
    }
}
