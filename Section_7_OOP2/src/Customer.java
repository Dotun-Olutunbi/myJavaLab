public class Customer {
    private String name;
    private Burger orderedBurger;
    private double burgerBill;

    public Customer(String name, Burger orderedBurger) {
        this.name = name;
        this.orderedBurger = orderedBurger;
    }

    public Burger getOrderedBurger() {
        return orderedBurger;
    }
    public void reciept(){
        System.out.println("Customer name: "+ this.name +"\n"+
        "Bill: " + orderedBurger.BurgerBill());
    }
}
