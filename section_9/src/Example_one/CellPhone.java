package Example_one;

public class CellPhone implements iTelephone{
    private int phoneNumber;
    private boolean isRinging;

    public CellPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("No power button");
    }

    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
