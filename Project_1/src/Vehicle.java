public class Vehicle {
    private int wheels;
    private int steering;
    private int exhaust;
    private int gears;
    private int gearState;
    private int trottleLevel;

    public Vehicle(int wheels, int steering, int exhaust, int gears, int gearState, int trottleLevel) {
        this.wheels = wheels;
        this.steering = steering;
        this.exhaust = exhaust;
        this.gears = gears;
        this.gearState = gearState;
        this.trottleLevel = trottleLevel;
    }

    public Vehicle(int steering, int exhaust){
        this(0, steering, exhaust, 0, 0, 0);}

    public void moving(){
        setTrottleLevel();
        System.out.println("Trottling speed :" + this.trottleLevel);
        System.out.println("Gear state: " + this.gearState);
        System.out.println("Moving at speed " + this.trottleLevel * this.gearState );
    }

    public void setTrottleLevel() {
        int maxTrottleLevel = 5;
        if(this.trottleLevel< maxTrottleLevel)
        this.trottleLevel += 1;
    else{
        System.out.println("Relax!");
    }}

    public void steering(boolean direction){
        if(steering>0){
        if(direction){
            System.out.println("Steering vehicle right");
        }else
            System.out.println("Steering vehicle left");
    }
    }

    public void changeGear(){
        if(this.gearState < this.gears){
            this.gearState +=1;
        }else{
            this.gearState = 0;
        }
    }

    public int getExhaust() {
        return exhaust;
    }

    public int getGearState() {
        return gearState;
    }

    public int getTrottleLevel() {
        return trottleLevel;
    }
}


