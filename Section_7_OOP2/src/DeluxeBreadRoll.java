public class DeluxeBreadRoll extends BaseBreadRoll{
    private boolean sweetner;

    public DeluxeBreadRoll(double breadRollPrice, int sugarLevel, boolean sweetner) {
        super(breadRollPrice, sugarLevel);
        this.sweetner = sweetner;
    }
}
