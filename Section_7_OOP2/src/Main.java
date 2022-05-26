public class Main {
    public static void main(String[] args) {

    }

    public static Movie randomMovie(){
        int x = (int)(Math.random()*5) + 1;
        switch (x){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            default:
                return null;
        }
    }
}

class Movie{
    private String Movie;
    public Movie(String title){
        this.Movie = title;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Bruce Willis saves the world from alien invasion";
    }
}



