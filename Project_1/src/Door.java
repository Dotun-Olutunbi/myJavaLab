public class Door {
    private int height;
    private Locker locker;
    private String doorMaterial;
    private int peepHole;

    public Door(int height, Locker locker, String doorMaterial, int peepHole) {
        this.height = height;
        this.locker = locker;
        this.doorMaterial = doorMaterial;
        this.peepHole = peepHole;
    }

    public Locker getLocker() {
        return locker;
    }
}
