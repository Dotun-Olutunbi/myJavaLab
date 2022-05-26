import java.awt.*;

public class Room {
    private Bed myBed;
    public Table myTable;
    public OfficeChair myChair;
    private Dimension dimension;
    private Door myDoor;

    public Room(Bed myBed, Table myTable, OfficeChair myChair, Dimension dimension, Door myDoor) {
        this.myBed = myBed;
        this.myTable = myTable;
        this.myChair = myChair;
        this.dimension = dimension;
        this.myDoor = myDoor;
    }

    public OfficeChair getMyChair() {
        return myChair;
    }

}
