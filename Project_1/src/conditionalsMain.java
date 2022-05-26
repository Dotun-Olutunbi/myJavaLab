public class conditionalsMain {
    public static void main(String[] args) {
        double x = 20.00;
        double xx = 80.0;
        double remd = 100*(x + xx)%40;
        boolean y = remd==0?true:false;
        System.out.println(y);
        if(y==false){
            System.out.println("You have a remainder");
    }
    }

    public static void checkNumber(int number){
        if(number>0) {
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
    }

