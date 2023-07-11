package homeWork_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SetUpPlayers {

    public void setUpPlayer() {
        Field playerField = new Field();

        Scanner console = new Scanner(System.in);

        int validationResult = 1;

        System.out.print("enter player name: ");
        Player player = new Player(console.nextLine(), playerField);

        ArrayList<Ship> playersShip = new ArrayList<Ship>();
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j < 5; j++) {
                Ship ship = new Ship(i);
                playersShip.add(ship);
            }
        }


        for (int i = 0; i <= playersShip.size() - 1; i++) {
//            while (validationResult != 0) {
                if (playersShip.get(i).getDecks() != 1) {
                    System.out.print("Enter " + playersShip.get(i).getDecks() + "-deck ship  X coordinate (X ∈ [0;9]): ");
                    int x = console.nextInt();
                    System.out.print("Enter " + playersShip.get(i).getDecks() + "-deck ship  Y coordinate (Y ∈ [0;9]): ");
                    int y = console.nextInt();

                    System.out.println("Enter the orientation of the ship ( 1 - vertical, 0 - horizontal ): ");
                    int isVertical = console.nextInt();

//                    validationResult = validatorShipsCoordinates(playerField.getField(),x,y,isVertical,playersShip.get(i).getDecks());

                    if (isVertical == 1) {
                        for (int j = playersShip.get(i).getDecks(); j > 0; j--) {
                            playerField.getField()[x][y] = playerField.getShipCell();
                            x++;
                        }
                        playerField.repaint(false);
                    } else {
                        for (int j = playersShip.get(i).getDecks(); j > 0; j--) {
                            playerField.getField()[x][y] = playerField.getShipCell();
                            y++;
                        }
                        playerField.repaint(false);
                    }
                } else {
                    System.out.print("Enter " + playersShip.get(i).getDecks() + "-deck ship  X coordinate: ");
                    int x = console.nextInt();
                    System.out.print("Enter " + playersShip.get(i).getDecks() + "-deck ship  Y coordinate: ");
                    int y = console.nextInt();

                    playerField.getField()[x][y] = playerField.getShipCell();

                    playerField.repaint(false);
                }
            }
//        }


        System.out.println("\n");
        System.out.println("Player " + player.getName() + " has deployed their ships.");
        System.out.println("-------------------------------------------");
    }

    public int validatorShipsCoordinates(char[][] field, int x, int y, int isVertical, int decks) {

        if (isVertical == 1) {
            for (int i = 0; i < decks - 1; i++) {
                if ('O' == field[y][x ]
                        || 'O' == field[y - 1][x]
                        || 'O' == field[y - 1][x + 1 + i]
                        || 'O' == field[y - 1][x - 1]
                        || 'O' == field[y][x + 1]
                        || 'O' == field[y][x - 1 - i]
                        || 'O' == field[y + 1][x]
                        || 'O' == field[y + 1][x - 1]
                        || 'O' == field[y + 1][x + 1 + i]
                        || (x + i) > 9)
                    return -1;
            }
        } else if (isVertical == 0) {
            for (int i = 0; i < decks - 1; i++) {
                if ('O' == field[y][x ]
                        || 'O' == field[y][x - 1]
                        || 'O' == field[y][x + 1]
                        || 'O' == field[y - 1][x]
                        || 'O' == field[y - 1][x - 1]
                        || 'O' == field[y - 1][x + 1]
                        || 'O' == field[y + 1 + i][x]
                        || 'O' == field[y + 1 + i][x + 1]
                        || 'O' == field[y + 1 + i][x - 1]
                        || (y + i) > 9)
                    return -1;
            }
        }

        return 0;

    }

}




