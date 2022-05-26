public class BaseBreadRoll {
    private double breadRollPrice;
    private int sugarLevel;

    public BaseBreadRoll(double breadRollPrice, int sugarLevel) {
        this.breadRollPrice = breadRollPrice;
        this.sugarLevel = sugarLevel;
    }

    public BaseBreadRoll() {
        this.breadRollPrice = 2.0;
        this.sugarLevel = 30;
    }
}

class BrownRyeBreadRoll extends BaseBreadRoll{

}
