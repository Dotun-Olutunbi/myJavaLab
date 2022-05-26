import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallengeMain {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("How many numbers would are you sorting here: ");
//        int x = scanner.nextInt();
//        double [] y = getIntegers(x);
////        double [] y = {22, 12, 8, 13, 6};
//        printArray(y);
//        System.out.println("----------------------");
//        y = sortArray(y);
//        printArray(y);
//        System.out.print("Enter the size of the array: ");
//        int count = scanner.nextInt();
//        int[] myarray3 = readInteger(count);
//        System.out.println(Arrays.toString(myarray3));
//        System.out.println(findMin(myarray3));
        System.out.println("-----------------------");
        int[] xy = {43,35, 12, 90, 200, 112};
        System.out.println(Arrays.toString(reverse(xy)));;
    }

    public static double[] getIntegers(int number){
        double n;
        double []nArray = new double[number];
        for(int i=0; i<number; i++){
        System.out.println("Enter your #"+ (i+1) + " :");
        nArray[i] = scanner.nextDouble();

    }
        return nArray;
    }

    public static void printArray(double[] x){
        System.out.print("[");
        for(int i=0; i<x.length -1; i++){
            System.out.print(x[i] + ", ");
        }
        System.out.print(x[x.length-1]);
        System.out.println("]");
    }

    public static double[] sortArray(double [] x){
        double a;
        for(int j =0; j<x.length-1; j++){
        for(int i=0; i<x.length-1; i++){
            if(x[i+1]<x[i]){
                a = x[i];
                x[i] = x[i+1];
                x[i+1] =a;
            }
        }
        }
        return x;
    }

    private static int[] readInteger(int count){
        int[] arrayX = new int[count]; //initializing all members to zero
        for(int i=0; i<count; i++){
            System.out.println("Enter element #" + (i+1) + ": ");
            arrayX[i] = scanner.nextInt();
            scanner.nextLine(); //this line is no longer necessary to process the ENTER key
        }
        return arrayX;
    }

    private static int findMin(int[] arrayN){
        int tempMin = arrayN[0];
        for(int i=1; i<arrayN.length; i++){
            if(arrayN[i]<tempMin){
                tempMin = arrayN[i];
            }
        }
        return tempMin;
    }

    private static void sortArray2 (int[] arrayX){
        System.out.println(Arrays.toString(arrayX));
        boolean flag = true; int temp; int x = 1;
        int count = 1;
        while(x < count){
            for(int i=0; i<arrayX.length-1; i++){
                if(arrayX[i+1] < arrayX[i]) {
                    temp = arrayX[i];
                    arrayX[i] = arrayX[i + 1];
                    arrayX[i + 1] = temp;
                }
                x++;
            }
        }
        System.out.println(Arrays.toString(arrayX));
    }

    private static int[] reverse(int[] array){
        int temp;
        int maxIndex = array.length-1;
        int j = maxIndex;
        for(int i = 0; i<(int)(array.length/2); i++, j--){
            //j below can be replaced by maxIndex-i;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
