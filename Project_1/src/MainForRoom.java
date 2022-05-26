import java.awt.*;
import java.util.concurrent.locks.Lock;

public class MainForRoom {
    public static void main(String[] args) {
        Matress vitaFoamX = new Matress(6,6,2, "Vitafoam", "X");
        Bed kingSizeBed = new Bed(6, 6, 4, vitaFoamX);
        Table officeTable = new Table(3, 4, 3, 3);
        OfficeChair myChair = new OfficeChair("Warehouse", 3, "Fabric", 2, 5);
        Dimension roomDimension = new Dimension(30, 50);
        Locker AstonBolt = new Locker(5, 3);
        Door myDoor = new Door(215, AstonBolt, "Wood", 1);

        Room myRoom = new Room(kingSizeBed, officeTable, myChair, roomDimension, myDoor);
    }
}
