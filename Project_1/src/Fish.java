public class Fish extends Animal{
    private int fins;
    private int gills;
    private int scales;

    public Fish(double weight, int brain, double height, String name, int fins, int gills, int scales) {
        super(weight, 1, name);
        this.fins = fins;
        this.gills = gills;
        this.scales = scales;
    }

    public void rest(){
        move(0);
}
public void swim(int speed){
        move(speed);
}
}
