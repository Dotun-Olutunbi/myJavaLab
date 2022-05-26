import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double [] myDoubleArray = {2, 3, 4, 6};
        myDoubleArray[0] = 22;
        arrayPrinter(myDoubleArray);
        System.out.println("----------------");
        double[] myArray;
        myArray = seedArray();
        arrayPrinter(myArray);
    }

    public static double[] seedArray(){
        double [] x = new double[5];
        arrayPrinter(x);
        System.out.println("Entering " + x.length + " values in an array.");
        for(int i = 0; i<x.length; i++){
            System.out.println("Enter the number: ");
            x[i] = scanner.nextDouble();
        }
        arrayPrinter(x);
        return x;
    }

    public static void arrayPrinter(double[] x){
        System.out.print("[");
        for(int i=0; i<x.length -1; i++){
            System.out.print(x[i] + ", ");
        }
        System.out.print(x[x.length-1]);
        System.out.println("]");
    }
}
