public class codingExercise15_22 {
    public static void main(String[] args) {
        boolean x = isPalidrome(33033);
        System.out.println(x);
        System.out.println("=========");
        int y = sumFirstAndLastDigit(24536);
        System.out.println(y);

    }
    public static boolean isPalidrome(int number){
        int reverse = 0;
        int OriginalNumber = number;
        while(true){
        int lastDigit = number % 10;
        reverse = reverse * 10;
        reverse += lastDigit;
        number = number / 10;
        if(number == 0){
            break;
        }

    }
        return reverse == OriginalNumber;
    }

    public static int sumFirstAndLastDigit(int number){
        if(number <0){
            System.out.println("Invalid Input");
            return -1;
        }
        int lastDigit = number % 10;
        int firsDigit = 0;
        while(true){
            firsDigit = number%10;
            number /= 10;   //throws away the remainder
            if(number == 0){
                break;
            }
        }
        System.out.println(lastDigit);
        System.out.println(firsDigit);
        return lastDigit + firsDigit;
    }
}
