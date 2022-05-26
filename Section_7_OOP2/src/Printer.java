public class Printer {
    private int tonerLevel= 0;
    private int noOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(this.tonerLevel>0 && this.tonerLevel<=100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.noOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public void fillTonerUp(int tonerQuantity){
        if(tonerQuantity<0){
            System.out.println("Wrong");
        }else{
        this.tonerLevel += tonerQuantity;
        if(this.tonerLevel>100) {
            this.tonerLevel = 100;
        }
        }
    }

    public void printing(int pagesPrinted){
        do{
        System.out.println("Printing ...");
        this.tonerLevel--;
        pagesPrinted--;
        this.noOfPagesPrinted++;
    }while(pagesPrinted > 0);
        if(this.isDuplex){
            int papers = noOfPagesPrinted/2 + noOfPagesPrinted%2;
        }
    }
}
