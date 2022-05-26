public class speedConverter{
    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<  0){
            return -1;
        }else{
            return Math.round(0.62137 * kilometersPerHour);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<  0){
            System.out.println("Invalid Input");
        }else{
            long x = Math.round(0.62137 * kilometersPerHour);
            System.out.println(kilometersPerHour +" km/h = " + x +" mi/hr");
        }
    }
}
