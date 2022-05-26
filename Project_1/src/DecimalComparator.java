public class DecimalComparator {
    public static boolean areEqualbyThreeDecimalPlaces(double x, double y){
        if(Math.abs(x-y) < 0.001){
            return true;
        }
        return false;
    }
}
