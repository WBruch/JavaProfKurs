package homeWork_2;

import java.util.Random;
import java.util.Arrays;

public class Deck extends Card{
    private int numberOfCards = Suits.values().length * Rank.values().length;

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public Rank[] getRank() {
        return rank;
    }

    public Suits[] getSuits() {
        return suits;
    }

    Rank[] rank = Rank.values();
    Suits[] suits = Suits.values();

    public String[] getDeckInit(Rank[] rank, Suits[] suits, int getNumberOfCards) {

        String[] deck = new String[getNumberOfCards];

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i].getRank() + " " + suits[j].getSuit();
            }
        }

        final Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public void showShuffledDeck(int players, int cardsForPlayer, String[] getDeckInit) {

        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(getDeckInit[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
