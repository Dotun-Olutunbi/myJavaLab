public class Hello {
    public static void main(String[] args) {
        System.out.println("hello World");
        byte myByte = (byte) 22;
        short myShort = (short) 345;
        int myInt =453;
        long myLongNumber = 50000 + 10* (myByte + myShort + myInt);
        System.out.println(myLongNumber);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

    }
}
