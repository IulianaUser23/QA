/**
 * Created by User on 17.01.2018.
 */
public class Dog {
    /*public String color = "brown";
    public String breed
    public int age = 6;= "ciobanesc";
    public double wheight = 80.5;
    public boolean alive = true;*/

    private String color;
    private String breed;
    private int age;
    private double wheight;
    private boolean alive;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWheight() {
        return wheight;
    }

    public void setWheight(double wheight) {
        this.wheight = wheight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

public void bark(){
    System.out.println("Ham!");
}
public void eat (){
    System.out.println("He is eating a lot!");
}

}