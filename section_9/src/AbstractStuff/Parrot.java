package AbstractStuff;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getNameOfAnimal() + " is hopping from branch to branch");
    }
}
