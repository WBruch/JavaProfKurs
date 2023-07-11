package homeWork_3;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private char[][] field;
    private char emptyCell = '.';
    private char shipCell = 'O';
    private char destroyedShip = 'X';
    private char missedShotCell = '*';
    private List<Ship> ships = new ArrayList<>();
//    private Ship[] ships = new Ship[10];
    public char getShipCell() {
        return shipCell;
    }

    public char[][] getField() {
        return field;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public Field() {
        field = new char[10][10];
        init();
    }

    private void init() {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field.length; y++) {
                field[x][y] = emptyCell;
            }
        }
    }

    public void repaint(boolean forOpponent) {
        // Если forOpponent - true, нужно отображать поле без неподбитых кораблей
        // Если forOpponent - false, нужно отображать все символы
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


}
