public class Sugar {
    private String color;
    private int scoops;
    private double price;

    public Sugar(String color, int scoops, double price) {
        this.color = color;
        this.scoops = scoops;
        this.price = price;
    }

    public Sugar(int scoops) {
        this.scoops = scoops;
        this.color = "White";
        this.price = 2*scoops; //$2 per scoop.
    }

    public Sugar(String color, int scoops) {
        this.scoops = scoops;
        this.color = color;
        this.price = 2*scoops; //$2 per scoop.
    }

    public double getPrice() {
        return price;
    }

    public int getScoops() {
        return scoops;
    }
}

class BrownSuger extends Sugar{
    public BrownSuger(int scoops) {
        super("Brown", scoops);
    }

    @Override
    public double getPrice() {
        return (super.getPrice() + 2) * super.getScoops();
    }
}

class GranulatedSugar extends Sugar{
    public GranulatedSugar(int scoops) {
        super("white", scoops);
    }

    public double getPrice() {
        return (super.getPrice() + 3) * super.getScoops();
    }
}