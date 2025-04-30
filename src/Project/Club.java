public class Club {

    String clubname;
    //Club constructor
    Club(String clubname){

        this.clubname= clubname;
    }

    //Method to buy a player from a club by entering the player and the amount which you are willing to offer
    public static void buyPlayer(Player player, int amount){

        //If you give a small offer lower than a player's market value, the club will reject your offer
        if(amount < player.getMarketValue()){
            System.out.printf("Your offer was rejected by " + player.getClub().clubname +". Offer was too low.\n");
        }
        
        //If you give a offer equal or more than a player's market value, the club will accept your offer
        else{
            System.out.printf(player.getClub().clubname + " has accepted your offer. Player bought succesfully.\n");
        }
    }
}
