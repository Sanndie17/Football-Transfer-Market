 public class Player{

    //Set the fields for a player
    private String name;
    private int age;
    private String position;
    private int rating;
    private int marketValue;
    //Each player has a club which he plays for
    private Club club;

    public Player(String name, int age, String position, int rating, int marketValue){

        this.name= name;
        this.age= age;
        this.position= position;
        this.rating= rating;
        this.marketValue= marketValue;
        //Link a player to his club
        this.club= new Club(Club);
    }

    //Getter method for name
    public static String getName(){
        return this.name;
    }

    //Getter method for age
    public static int getAge(){
        return this.age;
    }

    //Getter method for player's position
    public static String getPosition(){
        return this.position;
    }

    //Getter method for player's rating
    public static int getRating(){
        return this.rating;
    }

    //Getter method for player's market value in millons
    public static int getMarketValue(){
        return this.marketValue;
    }

    //Getter method for player's club
    public static Club getClub(){
        return this.club;
    }

    //Setter method for player name
    public static void setName(String newName){
        this.name= name;
    }

    //Setter method for age
    public static void setAge(int newAge){
        this.age= age;
    }

    //Setter method for position
    public static void setPosition(String newPosition){
        this.position= position;
    }

    //Setter method for rating
    public static void setRating(int newRating){
        this.rating= rating;
    }

    //Setter method for market value
    public static void setMarketValue(int newMarketValue){
        this.marketValue= marketValue;
    }

    //Setter method for player's club
    public static void setClub(Club newClub){
        this.clud= club;
    }


}