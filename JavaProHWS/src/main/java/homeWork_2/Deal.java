package homeWork_2;

public class Deal extends Player{
    public static void main(String[] args) {

        Player pokerPlayers = new Player();

        pokerPlayers.getNumbersOfPlayers(pokerPlayers.getNumberOfCards());

        pokerPlayers.showShuffledDeck(pokerPlayers.getPlayers(), pokerPlayers.getCardsForPlayer(),pokerPlayers.getDeckInit(Rank.values(),Suits.values(), pokerPlayers.getNumberOfCards()));



    }
}
