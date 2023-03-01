
import java.util.Scanner;

public class BattleshipGame {
    public static int rows = 10;
    public static int columns = 10;
    public static String[][] board1 = new String[rows][columns];
    public static String[][] board2 = new String[rows][columns];
    public static int player1NumberOfShips;
    public static int player2NumberOfShips;


    public static void main(String[] args) {
        createBoard1();
        createBoard2();
        deployShipsPlayer1();
        deployShipsPlayer2();

        do {
            Battle();
        } while (player1NumberOfShips != 0 || player2NumberOfShips != 0);
        GameOver();

    }


    public static void createBoard1() {
        System.out.println();
        System.out.println("Tablica Gracza UNO");
        for (int i = 0; i < board1.length; i++) {
            if (i == 0) {
                System.out.print("  " + i + "");
            } else {
                System.out.print(i + "");
            }
        }
        System.out.println();
        for (int a = 0; a < board1.length; a++) {
            for (int b = 0; b < board1[a].length; b++) {
                board1[a][b] = " ";
                if (b == 0) {
                    System.out.print(a + board1[a][b]);
                }
                if (b == board1.length - 1) {
                    System.out.print(board1[a][b] + a);
                } else {
                    System.out.print(board1[a][b]);
                }
            }
            System.out.println();
        }

        for (int i = 0; i < board1.length; i++) {
            if (i == 0) {
                System.out.print("  " + i + "");
            } else {
                System.out.print(i + "");
            }
        }
    }

    public static void createBoard2() {
        System.out.println();
        System.out.println("Tablica gracza DOS");
        for (int i = 0; i < board2.length; i++) {
            if (i == 0) {
                System.out.print("  " + i + "");
            } else {
                System.out.print(i + "");
            }
        }
        System.out.println();
        for (int a = 0; a < board2.length; a++) {
            for (int b = 0; b < board2[a].length; b++) {
                board2[a][b] = " ";
                if (b == 0) {
                    System.out.print(a + board2[a][b]);
                }
                if (b == board2.length - 1) {
                    System.out.print(board2[a][b] + a);
                } else {
                    System.out.print(board2[a][b]);
                }
            }
            System.out.println();
        }

        for (int i = 0; i < board2.length; i++) {
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

        BattleshipGame.player1NumberOfShips = 5;
        System.out.println();
        for (int i = 1; i < player1NumberOfShips; ) {
            System.out.println("Podaj rząd (0-9) dla swojego " + i + " statku");
            int x = deploy.nextInt();
            System.out.println("Podaj kolumnę (0-9) dla swojego " + i + " statku");
            int y = deploy.nextInt();

            if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board1[x][y] == " ")) {
                board1[x][y] = "#";
                i++;
            } else if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board1[x][y] == "@")) {
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

        BattleshipGame.player2NumberOfShips = 5;
        System.out.println();
        for (int i = 1; i < player1NumberOfShips; ) {
            System.out.println("Podaj rząd (0-9) dla swojego " + i + " statku");
            int x = deploy.nextInt();
            System.out.println("Podaj kolumnę (0-9) dla swojego " + i + " statku");
            int y = deploy.nextInt();

            if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board2[x][y] == " ")) {
                board2[x][y] = "#";
                i++;
            } else if ((x >= 0 && x < rows) && (y >= 0 && y < columns) && (board2[x][y] == "@")) {
                System.out.println("Nie możesz położyc dwóch statków w tym samym miejscu");
            } else if ((x < 0 || x > rows) || (y < 0 || y > columns)) {
                System.out.println("Pojebało Cię? tablica jest " + rows + "X" + columns);
            }
        }
        showBoardPlayer2();
    }


    public static void showBoardPlayer1() {
        System.out.println();
        System.out.println("Tablica Gracza 1");
        System.out.print(" ");
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int x = 0; x < board1.length; x++) {
            System.out.print(x);
            for (int y = 0; y < board1[x].length; y++) {
                System.out.print(board1[x][y]);
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
        System.out.println("Tablica Gracza 2");
        System.out.print(" ");
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int x = 0; x < board2.length; x++) {
            System.out.print(x);
            for (int y = 0; y < board2[x].length; y++) {
                System.out.print(board2[x][y]);
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

    public static void player1Turn() {
        System.out.println("\n Kolej gracza 1");
        int x = -1;
        int y = -1;
        do {
            Scanner attempt = new Scanner(System.in);
            System.out.println("Podaj rząd w który chcesz uderzyć (0-9):");
            x = attempt.nextInt();
            System.out.println("Podaj kolumnę w którą chcesz uderzyć (0-9):");
            y = attempt.nextInt();

            if ((x >= 0 && x < rows) && (y >= 0 && y < columns)) {
                if (board2[x][y] == "#") {
                    System.out.println("Trafiłes w statek Gracza 2 tego gnojka jebanego");
                    board2[x][y] = "X";
                    --player2NumberOfShips;
                } else if (board2[x][y] == " ") {
                    System.out.println("Pudło");
                    board2[x][y] = "-";
                }
            } else if ((x < 0 || x > (rows - 1)) || (y < 0 || y > (columns - 1))) {
                System.out.println("Możesz typować jedynie w obszarze od (0-9) do (0-9)");
            }
        } while ((x < 0 || x > (rows - 1)) || (y < 0 || y > (columns - 1)));
    }

    public static void player2Turn() {
        System.out.println("\n Kolej gracza 2");
        int x = -1;
        int y = -1;
        do {
            Scanner attempt = new Scanner(System.in);
            System.out.println("Podaj rząd w który chcesz uderzyć (0-9):");
            x = attempt.nextInt();
            System.out.println("Podaj kolumnę w którą chcesz uderzyć (0-9):");
            y = attempt.nextInt();

            if ((x >= 0 && x < rows) && (y >= 0 && y < columns)) {
                if (board1[x][y] == "#") {
                    System.out.println("Trafiłes w statek Gracza 1 tego gnojka jebanego");
                    board1[x][y] = "X";
                    --player1NumberOfShips;
                } else if (board1[x][y] == " ") {
                    System.out.println("Pudło");
                    board1[x][y] = "-";
                }
            } else if ((x < 0 || x > (rows - 1)) || (y < 0 || y > (columns - 1))) {
                System.out.println("Możesz typować jedynie w obszarze od (0-9) do (0-9)");
            }
        } while ((x < 0 || x > (rows - 1)) || (y < 0 || y > (columns - 1)));
    }

    public static void Battle() {
        player1Turn();
        player2Turn();

        showBoardPlayer1();
        showBoardPlayer2();

        System.out.println();
        System.out.println("Pozostałe statki Gracza 1: " + player1NumberOfShips);
        System.out.println("Pozostałe statki Gracza 2: " + player2NumberOfShips);
        System.out.println();
    }

    public static void GameOver() {
        if (player1NumberOfShips > 0) {
            System.out.println("Wygral Gracz 1");
        }
        if (player2NumberOfShips > 0) {
            System.out.println("Wygrał Gracz 2");
        }
    }
}