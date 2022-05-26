package AbstractStuff;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getNameOfAnimal() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing in and out");
    }

    public abstract void fly();
}
