import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Create clubs with all required parameters
            Club barcelona = new Club("Barcelona", "Gavi", 20, "CM", 84, 90);
            Club atlanta = new Club("Atlanta", "Lookman", 27, "ST", 81, 60);
            Club liverpool = new Club("Liverpool", "Cheisa", 27, "LW", 87, 18);
            Club bayernMunch = new Club("Bayern Munch", "Olise", 23, "CAM", 82, 80);
            Club dortmund = new Club("Dortmund", "Adeyemi", 23, "LW", 80, 40);
            Club acMilan = new Club("AC Milan", "Pulisic", 26, "RW", 86, 50);
            Club manCity = new Club("Manchester City", "Ederson", 31, "GK", 89, 25);
            Club realMadrid = new Club("Real Madrid", "Camavinga", 22, "CDM", 83, 75);
            Club psg = new Club("PSG", "Barcola", 22, "RW", 79, 70);

            // Create players
            Player[] players = {
                new Player("Gavi", 20, "CM", 84, 90, barcelona),
                new Player("Lookman", 27, "ST", 81, 60, atlanta),
                new Player("Cheisa", 27, "LW", 87, 18, liverpool),
                new Player("Olise", 23, "CAM", 82, 80, bayernMunch),
                new Player("Adeyemi", 23, "LW", 80, 40, dortmund),
                new Player("Pulisic", 26, "RW", 86, 50, acMilan),
                new Player("Ederson", 31, "GK", 89, 25, manCity),
                new Player("Camavinga", 22, "CDM", 83, 75, realMadrid),
                new Player("Davies", 24, "LB", 85, 52, bayernMunch),
                new Player("Barcola", 22, "RW", 79, 70, psg)
            };

            // Display players
            System.out.println("Available players:");
            for (int i = 0; i < players.length; i++) {
                System.out.printf("%d. %s (%s) - Market Value: $%dM\n", i + 1, players[i].getName(), players[i].getPosition(), players[i].getMarketValue());
            }

            // Prompt user to select a player
            System.out.print("Enter the number of the player you want to buy: ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > players.length) {
                System.out.println("Invalid choice.");
                return;
            }
            Player selectedPlayer = players[choice - 1];

            // Prompt for offer amount
            System.out.print("Enter your offer amount: ");
            int offerAmount = scanner.nextInt();

            // Prompt for offer price
            System.out.print("Enter your offer price: ");
            int offerPrice = scanner.nextInt();

            // Call buyPlayer method with exception handling
            try {
                selectedPlayer.getClub().buyPlayer(selectedPlayer, offerPrice, offerAmount);
            } catch (UsageException e) {
                System.out.println("Purchase failed: " + e.getMessage());
            }

            System.out.println("Purchase Completed.");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}