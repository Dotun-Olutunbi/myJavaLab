import java.util.GregorianCalendar;

public class Main_35_36 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle Area is: " + circle.getArea());
        System.out.println("----------------");
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("-------------Pool Challenge-------------");
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println(cuboid.getWidth());
        System.out.println(cuboid.getLength());
        System.out.println(cuboid.getArea());
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());
    }
}
