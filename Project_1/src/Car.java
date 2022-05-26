public class Car extends Vehicle {
    private int doors;
    private int color;
    private String model;
    private String make;

    public Car(int wheels, int steering, int exhaust, int gears, int gearState, int trottleLevel, int doors, int color, String model, String make) {
        super(wheels, steering, exhaust, gears, gearState, trottleLevel);
        this.doors = doors;
        this.color = color;
        this.model = model;
        this.make = make;
    }

    public Car() {
        super(4, 1, 1, 5, 0, 0);
    }

    public void setDoors(int doors){
        if(doors<1){
            System.out.println("Non-standard. Invalid car");
        }else{
            this.doors = doors;
        }
    }

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("posche") ){
            System.out.println("Correct.");
            this.setModel(validModel);
        }
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
    public int getDoors(){
        return this.doors;
    }
    public String getModel(){
        return this.model;
    }
    public String getMake(){
        return this.make;
    }
}
