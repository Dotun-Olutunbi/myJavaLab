package Example_two;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int goalScores;
    private int strength;
    private String skill;

    public Player(String name, int goalScores, int strength, String skill) {
        this.name = name;
        this.goalScores = goalScores;
        this.strength = strength;
        this.skill = "hattrick";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoalScores() {
        return goalScores;
    }

    public void setGoalScores(int goalScores) {
        this.goalScores = goalScores;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", goalScores=" + goalScores +
                ", strength=" + strength +
                ", skill='" + skill + '\'' +
                '}';
    }

    public List<String> write(){
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, ""+this.goalScores);
        values.add(2, ""+this.strength);
        values.add(3, this.skill);
        return values;
    }

    public void read(List<String> savedValues){
        if(savedValues != null && savedValues.size() >0){
            this.name= savedValues.get(0);
            this.goalScores = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.skill = savedValues.get(3);
        }
    }
}
