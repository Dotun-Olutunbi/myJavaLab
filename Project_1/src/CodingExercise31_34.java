public class CodingExercise31_34 {
    public static void main(String[] args) {
        Wall dotunWall = new Wall(5,4);
        System.out.println(dotunWall.getArea());
        dotunWall.setHeight(-1.5);
        System.out.println("width " + dotunWall.getWidth());
        System.out.println("Height: " + dotunWall.getHeight());
        System.out.println("========================");
        System.out.println(23);
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));
        Point point = new Point();
        System.out.println(point.distance());
        System.out.println("---------Floor and Carpet------------------");
        Floor floor = new Floor(2.75, 4);
        System.out.println(floor.getArea());
        floor.getArea();
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());
        Floor floor1 = new Floor(5.4, 4.5);
        Carpet carpet1 = new Carpet(1.5);
        Calculator calculator1 = new Calculator(floor1,carpet1);
        System.out.println(calculator1.getTotalCost());
        System.out.println("---------------Complex Numbers----------------------------");
        ComplexNumber one = new ComplexNumber(1,1);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        one.subtract(number);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());
    }
}
