package Project;

public class Player extends Club
{
    private String name;
    private int age;
    private String position;
    private double rating;
    private int marketValue;
    
    // Constructor

    public Player(String name, int age, String position, double rating,int marketValue){
        this.name = name;
        this.age = age;
        this.position = position;
        this.rating = rating;
        this.marketValue = marketValue;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static int getMarketValue(){
        return this.marketValue;
    }

    public static void setMarketValue(int newMarketValue){
        this.marketValue= marketValue;
    }
}