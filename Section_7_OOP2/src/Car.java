public class Car {
    private double engineCapacity;
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(double engineCapacity, int cylinders, String name) {
        this.engineCapacity = engineCapacity;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.name = name;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("Engine starting \n" + "Engine revving...");
    }

    public void accelerate(){
        System.out.println("Engine revving...");
    }

    public void brake(){
        System.out.println("Stopping now...");
    }
}
