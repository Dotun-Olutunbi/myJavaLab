public class Burger {
    private double basePrice;
    private BaseBreadRoll breadRollType;
    private boolean meat;
    private Sugar sugar;
    private boolean lettuceAddition;
    private boolean tomatoesAddition;
    private boolean carrotsAddition;

    public Burger(double basePrice, BaseBreadRoll breadRollType, boolean meat, Sugar sugar, boolean lettuceAddition, boolean tomatoesAddition, boolean carrotsAddition) {
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
        this.sugar = sugar;
        this.meat = meat;
        this.lettuceAddition = lettuceAddition;
        this.tomatoesAddition = tomatoesAddition;
        this.carrotsAddition = carrotsAddition;
    }

    public Burger(double basePrice, BaseBreadRoll breadRollType, boolean meat) {
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.sugar = new Sugar(1);
        this.lettuceAddition = false;
        this.tomatoesAddition = false;
        this.carrotsAddition = false;

    }

    public boolean isMeat() {
        return meat;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public boolean isLettuceAddition() {
        return lettuceAddition;
    }

    public boolean isTomatoesAddition() {
        return tomatoesAddition;
    }

    public boolean isCarrotsAddition() {
        return carrotsAddition;
    }

    public double BurgerBill(){
        if(this.carrotsAddition){
            basePrice+=2;
        }
        if(this.lettuceAddition){
            basePrice+=3;
        }
        if(this.tomatoesAddition){
            basePrice+=4;
        }

        return basePrice;
    }
}
