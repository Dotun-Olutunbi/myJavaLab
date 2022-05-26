public class Animal {
    private double weight;
    private int brain;
    private double height;
    private String name;

    public Animal(double weight, int brain, double height, String name) {
        this.weight = weight;
        this.brain = brain;
        this.height = height;
        this.name = name;
    }

    public Animal(double weight,int brain, String name){
        this.weight = weight;
        this.brain = brain;
        this.name = name;
    }

    public void eat(){
        System.out.println("Eating ...");
    }
    public void move(double speed){
        System.out.println("Animal is moving... at "+ speed);
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
}
