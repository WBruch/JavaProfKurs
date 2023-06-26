package homeWork_2;

import java.util.Scanner;

public class Player extends Deck {
    final int cardsForPlayer = 5;
    int players;

    public int getCardsForPlayer() {
        return cardsForPlayer;
    }

    public int getPlayers() {
        return players;
    }

    public Scanner getSc() {
        return sc;
    }

    final Scanner sc = new Scanner(System.in);

    public void getNumbersOfPlayers(int getNumberOfCards) {
        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= getNumberOfCards && players != 0 && players > 0) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
                break;
            }
        }

    }
}
