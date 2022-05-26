public class megaByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloByte){
        if(kiloByte < 0){
            System.out.println("Invalid Value");
        }else{
            int mega_x  = (int)kiloByte/1000;
            int kilo_x = kiloByte % 1000;
            System.out.println (kiloByte +" KB = " + mega_x + " MB and " + kilo_x + " KB");
        }
    }

}
