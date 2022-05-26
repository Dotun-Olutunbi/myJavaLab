public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    public Hamburger(double price, String name, String meat, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String additionName, double additionPrice){
        addition1Price = additionPrice;
        this.price += this.addition1Price;
    }
    public void addHamburgerAddition2(){
        this.price += this.addition2Price;
    }
    public void addHamburgerAddition3() {
        this.price += this.addition3Price;
    }
    public void addHamburgerAddition4() {
        this.price += this.addition4Price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double itemizeHamburger(){
        return this.price;
    }
}

class DeluxeBurger extends Hamburger{
    public void addHamburgerAddition1() {
        System.out.println("No additonal items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2() {
        System.out.println("No additonal items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3() {
        super.addHamburgerAddition3();
    }

    @Override
    public void addHamburgerAddition4() {
        System.out.println("No additonal items can be added to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        return this.itemizeHamburger();
    }

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(19.10, name, meat, breadRollType);

    }
}

class HealthyBurger extends Hamburger{
    private String HealthyExtra1Name;
    private double HealthyExtra1Price;
    private String HealthyExtra2Name;
    private double HealthyExtra2Price;

    public HealthyBurger(double price, String meat, String breadRollType) {
        super(price, "Healthy Burger", meat, breadRollType);
    }

    public void addHealhtyAddition1(String name, double price){
        this.HealthyExtra1Price = price;
        super.setPrice(super.getPrice()+ price);
    }

    public void addHealhtyAddition2(String name, double price){
        this.HealthyExtra2Price = price;
        super.setPrice(super.getPrice()+ price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}


