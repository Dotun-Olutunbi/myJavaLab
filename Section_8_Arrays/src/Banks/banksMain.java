package Banks;

public class banksMain {
    public static void main(String[] args) {
        Cuxtomer x = new Cuxtomer("Ocho");
        x = null;
        if(x!=null){
            System.out.println("The object exists");
        }
        if(x==null){
            System.out.println("It's a null");
        }
    }
}
