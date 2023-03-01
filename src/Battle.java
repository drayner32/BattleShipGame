
import java.util.Scanner;

public class Battle {
    public static int rows = 10;
    public static int columns = 10;
    public static String[][] board = new String[rows][columns];
    public static int player1NumberOfShips = 5;
    public static int player2NumberOfShips = 5;

    public static int getPlayer1NumberOfShips() {
        return player1NumberOfShips;
    }
    public static int getPlayer2NumberOfShips() {
        return player2NumberOfShips;
    }

    public static void main(String[] args) {
        createBoard();
        deployShipsPlayer1();
        deployShipsPlayer2();

    }

    public static void createBoard() {
        for (int i = 0; i < board.length; i++) {
            if (i == 0) {
                System.out.print("  " + i + "");
            } else {
                System.out.print(i + "");
            }
        }
        System.out.println();
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[a].length; b++) {
                board[a][b] = " ";
                if (b == 0) {
                    System.out.print(a + board[a][b]);
                }
                if (b == board.length - 1) {
                    System.out.print(board[a][b] + a);
                } else {
                    System.out.print(board[a][b]);
                }
            }
            System.out.println();
        }

        for (int i = 0; i < board.length; i++) {
            if (i == 0) {
                System.out.print("  " + i + "");
            } else {
                System.out.print(i + "");
            }
        }
    }

    public static void deployShipsPlayer1() {
        System.out.println();
        System.out.println("GRACZ NUMERO UNO");
        Scanner deploy = new Scanner(System.in);

        Battle.getPlayer1NumberOfShips();
        System.out.println();
        for (int i = 1; i < getPlayer1NumberOfShips(); ) {
            System.out.println("Podaj rząd (0-9) dla swojego " + i + " statku");
            int x = deploy.nextInt();
            System.out.println("Podaj kolumnę (0-9) dla swojego " + i + " statku");
            int y = deploy.nextInt();

            if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board[x][y] == " ")) {
                board[x][y] = "#";
                i++;
            } else if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board[x][y] == "@")) {
                System.out.println("Nie możesz położyc dwóch statków w tym samym miejscu");
            } else if ((x < 0 || x > rows) || (y < 0 || y > columns)) {
                System.out.println("Pojebało Cię? tablica jest " + rows + "X" + columns);
            }
        }
        showBoardPlayer1();
    }
    public static void deployShipsPlayer2() {
        System.out.println();
        System.out.println("GRACZ NUMERO DOS");
        Scanner deploy = new Scanner(System.in);

        Battle.getPlayer2NumberOfShips();
        System.out.println();
        for (int i = 1; i < getPlayer1NumberOfShips(); ) {
            System.out.println("Podaj rząd (0-9) dla swojego " + i + " statku");
            int x = deploy.nextInt();
            System.out.println("Podaj kolumnę (0-9) dla swojego " + i + " statku");
            int y = deploy.nextInt();

            if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board[x][y] == " ")) {
                board[x][y] = "#";
                i++;
            } else if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board[x][y] == "@")) {
                System.out.println("Nie możesz położyc dwóch statków w tym samym miejscu");
            } else if ((x < 0 || x > rows) || (y < 0 || y > columns)) {
                System.out.println("Pojebało Cię? tablica jest " + rows + "X" + columns);
            }
        }
        showBoardPlayer2();
    }


    public static void showBoardPlayer1() {
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int x = 0; x < board.length; x++) {
            System.out.print(x);
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y]);
            }
            System.out.println(x);
        }
        for (int i = 0; i < columns; i++) {
            if (i == 0) {
                System.out.print(" " + i);
            } else {
                System.out.print(i);
            }
        }
    }
    public static void showBoardPlayer2() {
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int x = 0; x < board.length; x++) {
            System.out.print(x);
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y]);
            }
            System.out.println(x);
        }
        for (int i = 0; i < columns; i++) {
            if (i == 0) {
                System.out.print(" " + i);
            } else {
                System.out.print(i);
            }
        }
    }
}