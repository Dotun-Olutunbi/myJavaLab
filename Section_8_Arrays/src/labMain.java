import java.util.ArrayList;

public class labMain {
    public static void main(String[] args) {

        ArrayList<Integer> myIntArrayList = new ArrayList<>();

        myIntArrayList.add(22);
        myIntArrayList.add(43);
        myIntArrayList.add(Integer.valueOf(34));

        for(int i = 1; i<6; i++){
            myIntArrayList.add(i);
        }
        System.out.println("----------------------");
        for(int i=0; i<myIntArrayList.size(); i++){
            System.out.print(myIntArrayList.get(i) + " ");
        }

        System.out.println("------------------------================");
        ArrayList<Double> myDoubles = new ArrayList<>();
        for(double i = 0; i<5; i+=0.5){
            myDoubles.add(i);
        }

        for(int i= 0; i<myDoubles.size(); i++){
            System.out.print(myDoubles.get(i) + " ");
        }
    }
}
