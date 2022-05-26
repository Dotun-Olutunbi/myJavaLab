public class OfficeChair extends Chair{
    private int headRest;
    private String chairMaterial;
    private int backRestLever;
    private int wheels;

    public OfficeChair(String maker, int height, String chairMaterial, int backRestLever, int wheels) {
        super(maker, height);
        this.headRest = 1;
        this.chairMaterial = chairMaterial;
        this.backRestLever = backRestLever;
        this.wheels = wheels;
    }

    public void chairSpringDown(boolean down){
        if(down){
        System.out.println("Chair is being occupied");
    }else
        {System.out.println("Chair is vacant");
}}

}
