package homeWork_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SetUpPlayers {

    public void setUpPlayer() {
        Field playerField = new Field();

        Scanner console = new Scanner(System.in);

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
            System.out.print("Enter " + playersShip.get(i).getDecks() + "-deck ship  X coordinate: ");
            int x = console.nextInt();
            System.out.print("Enter " + playersShip.get(i).getDecks() + "-deck ship  Y coordinate: ");
            int y = console.nextInt();

            for (int j = playersShip.get(i).getDecks(); j > 0; j--) {
                playerField.getField()[x][y] = playerField.getShipCell();
                x++;
            }

        }
        playerField.repaint(false);
    }


}




