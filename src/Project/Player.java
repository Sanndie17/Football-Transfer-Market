public class Player {

    // Set the fields for a player
    private String name;
    private int age;
    private String position;
    private int rating;
    private int marketValue; // in millions
    private Club club; // Each player has a club

    // Constructor
    public Player(String name, int age, String position, int rating, int marketValue, Club club) 
    throws UsageException {
        if (name == null || name.trim().isEmpty()) {
            throw new UsageException("Player name cannot be empty.");
        }
        if (age <= 0 || age > 100) {
            throw new UsageException("Invalid age: " + age);
        }
        if (position == null || position.trim().isEmpty()) {
            throw new UsageException("Position cannot be empty.");
        }
        if (rating < 0 || rating > 100) {
            throw new UsageException("Rating must be between 0 and 100.");
        }
        if (marketValue < 0) {
            throw new UsageException("Market value cannot be negative.");
        }
        // club can be null

        this.name = name;
        this.age = age;
        this.position = position;
        this.rating = rating;
        this.marketValue = marketValue;
        this.club = club;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getRating() {
        return rating;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public Club getClub() {
        return club;
    }

    // Setter methods
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public void setRating(int newRating) {
        this.rating = newRating;
    }

    public void setMarketValue(int newMarketValue) {
        this.marketValue = newMarketValue;
    }

    public void setClub(Club newClub) {
        this.club = newClub;
    }
}