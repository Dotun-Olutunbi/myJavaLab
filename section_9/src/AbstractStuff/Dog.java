package AbstractStuff;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getNameOfAnimal() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getNameOfAnimal() + " is breathing.");
    }
}
