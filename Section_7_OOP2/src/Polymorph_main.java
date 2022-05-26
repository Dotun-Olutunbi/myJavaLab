public class Polymorph_main {
    public static void main(String[] args) {
    Car baseCar = new Car(1.2, 4,"Mircra");
    baseCar.startEngine();
    baseCar.accelerate();
    baseCar.brake();
        System.out.println("-------------------------");
    MercedesBenz mercedesBenz = new MercedesBenz(2.5, 4,"Benz");
    mercedesBenz.startEngine();
    mercedesBenz.accelerate();
    mercedesBenz.brake();
    System.out.println("-------------------------");
    Toyota toyota = new Toyota(2.5, 4,"Benz");
        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();
    }

}

class Toyota extends Car{
    public Toyota(double engineCapacity, int cylinders, String name) {
        super(engineCapacity, cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Revving my Polymorph_main.Toyota");
    }
}

class MercedesBenz extends Car{
    public MercedesBenz(double engineCapacity, int cylinders, String name) {
        super(engineCapacity, cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Revving crazy benz");
    }
}

class BMW extends Car{
    public BMW(double engineCapacity, int cylinders, String name) {
        super(engineCapacity, cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Revving BMW");
    }
}


