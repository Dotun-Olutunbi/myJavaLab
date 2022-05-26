public class Dog extends Animal {
    private int eyes;
    private int ears;
    private int legs;
    private int teeth;

    public Dog(double weight, double height, String name, int teeth) {
        super(weight, 1, height, name);
        this.eyes = 2;
        this.ears = 2;
        this.legs = 4;
    }

    private void chew(){
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        move(33);
    }
    public void run(){
        move(55);
    }
}
