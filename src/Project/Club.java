import java.util.List;
import java.util.ArrayList;

public class Club extends Player {

    private String clubName; 
    private List<Player> players;

    public Club(String clubName, String name, int age, String position, int rating, int marketValue) throws UsageException {
        super(name, age, position, rating, marketValue, null);
        this.clubName = clubName;
        this.players = new ArrayList<>();
    }

    public String getClubName() {
        return this.clubName;
    }

    public void addPlayer(Player player) {
        if (player != null && !players.contains(player)) {
            players.add(player);
            player.setClub(this);
        }
    }

    public void removePlayer(Player player) {
        if (player != null && players.contains(player)) {
            players.remove(player);
            player.setClub(null);
        }
    }

    public void buyPlayer(Player player, int offerPrice, int offerAmount) throws UsageException {
        if (player == null) {
            throw new UsageException("Cannot buy a null player.");
        }
        if (offerPrice <= 0 || offerAmount <= 0) {
            throw new UsageException("Offer price and amount must be positive.");
        }

        Player currentPlayer = player.getClub();

        // If player is already in this club
        if (currentPlayer != null && currentPlayer.getClub() == this) {
            throw new UsageException(player.getName() + " is already in " + this.getClubName());
        }

        // Remove from current club if applicable
        if (currentPlayer != null) {
            if (currentPlayer.getClub() != null && currentPlayer.getClub() != this) {
                // Remove player from their current club
                currentPlayer.getClub().removePlayer(player);
            }
        }

        // Check offer validity
        if (offerPrice < player.getMarketValue() || offerAmount < player.getMarketValue()) {
            System.out.println("Your offer was rejected by " + this.getClubName() + ". Offer was too low.");
            return;
        }

        // Add player to this club
        this.addPlayer(player);
        System.out.println(player.getName() + " bought for $" + offerPrice + " million by " + this.getClubName());
    }
}