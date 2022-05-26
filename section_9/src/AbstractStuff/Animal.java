package AbstractStuff;

public abstract class Animal {
    private String nameOfAnimal;

    public Animal(String name) {
        this.nameOfAnimal = name;
    }

    //Note that there is no implementation of this method
    public abstract void eat();
    public abstract void breathe();

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }
}
