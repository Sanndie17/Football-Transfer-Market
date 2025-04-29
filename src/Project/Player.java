 public class Player{

    //Set the fields for a player
    private String name;
    private int age;
    private String position;
    private int rating;
    private int marketValue;
    //Each player has a club which he plays for
    private Club club;

    public Player(String name, int age, String position, int rating, int marketValue,Club club){

        this.name= name;
        this.age= age;
        this.position= position;
        this.rating= rating;
        this.marketValue= marketValue;
        //Link a player to his club
        this.club= club;
    }

    //Getter method for name
    public String getName(){
        return this.name;
    }

    //Getter method for age
    public  int getAge(){
        return this.age;
    }

    //Getter method for player's position
    public  String getPosition(){
        return this.position;
    }

    //Getter method for player's rating
    public int getRating(){
        return this.rating;
    }

    //Getter method for player's market value in millons
    public  int getMarketValue(){
        return this.marketValue;
    }

    //Getter method for player's club
    public  Club getClub(){
        return this.club;
    }

    //Setter method for player name
    public  void setName(String newName){
        this.name= name;
    }

    //Setter method for age
    public  void setAge(int newAge){
        this.age= age;
    }

    //Setter method for position
    public  void setPosition(String newPosition){
        this.position= position;
    }

    //Setter method for rating
    public  void setRating(int newRating){
        this.rating= rating;
    }

    //Setter method for market value
    public  void setMarketValue(int newMarketValue){
        this.marketValue= marketValue;
    }

    //Setter method for player's club
    public  void setClub(Club newClub){
        this.club = club;
    }


}
