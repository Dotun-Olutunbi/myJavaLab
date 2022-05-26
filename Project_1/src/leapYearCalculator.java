public class leapYearCalculator {
    public static boolean isLeapYear(int year){
        if(year<1 || year > 9999){
            return false;
        }else{
           return calculateIfLeapYear(year);
        }
    }

    public static boolean calculateIfLeapYear(int year){
        if (year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0; // year is a leap
            }
        }
        else{ return false;}
   return false; }
}
