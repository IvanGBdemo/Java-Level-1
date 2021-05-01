import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty_field = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {
        mapSizeX = 5;
        mapSizeY = 5;
        map = new char[mapSizeY][mapSizeX];
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_field;
            }
        }
    }
    public static void printMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
    public static void humanTurn() {
    int x;
    int y;
    do {
        System.out.println("Enter your turn coordinates from 1 before " + mapSizeX + ":");
        x = scanner.nextInt() - 1;
        y = scanner.nextInt() - 1;
    } while (!isValidCell(x, y) || !isEmptyCell(x, y));
             map[y][x] = human;
    }
    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y)); // && map[x][y] == human && map[x - 1][y] == human && map[x - 2][y] == human
        System.out.println("AI turn is [" + (y + 1) +":" + (x + 1) + "]");
        map[y][x] = ai;
    }
    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }
    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == empty_field;
    }
    public static boolean isDraw() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
               if (map[y][x] == empty_field) {
                   return false;
               }
            }
        }
        return true;
    }
    public static boolean checkWin(char player) {
 //   for (int y = 0; y < mapSizeY; y++) {
  //  for (int x = 0; x < mapSizeX; x++) {
//      If ()
  //      }
  //  }
    if (map[0][0] == player && map[0][1] == player && map[0][2] == player && map[0][3] == player) return true;
    if (map[0][1] == player && map[0][2] == player && map[0][3] == player && map[0][4] == player) return true;
    if (map[1][0] == player && map[1][1] == player && map[1][2] == player && map[1][3] == player) return true;
    if (map[1][1] == player && map[1][2] == player && map[1][3] == player && map[1][4] == player) return true;
    if (map[2][0] == player && map[2][1] == player && map[2][2] == player && map[2][3] == player) return true;
    if (map[2][1] == player && map[2][2] == player && map[2][3] == player && map[2][4] == player) return true;
    if (map[3][0] == player && map[3][1] == player && map[3][2] == player && map[3][3] == player) return true;
    if (map[3][1] == player && map[3][2] == player && map[3][3] == player && map[3][4] == player) return true;
    if (map[4][0] == player && map[4][1] == player && map[4][2] == player && map[4][3] == player) return true;
    if (map[4][1] == player && map[4][2] == player && map[4][3] == player && map[4][4] == player) return true;

    if (map[0][0] == player && map[1][0] == player && map[2][0] == player && map[3][0] == player) return true;
    if (map[1][0] == player && map[2][0] == player && map[3][0] == player && map[4][0] == player) return true;
    if (map[0][1] == player && map[1][1] == player && map[2][1] == player && map[3][1] == player) return true;
    if (map[1][1] == player && map[2][1] == player && map[3][1] == player && map[4][1] == player) return true;
    if (map[0][2] == player && map[1][2] == player && map[2][2] == player && map[3][2] == player) return true;
    if (map[1][2] == player && map[2][2] == player && map[3][2] == player && map[4][2] == player) return true;
    if (map[0][3] == player && map[1][3] == player && map[2][3] == player && map[3][3] == player) return true;
    if (map[1][3] == player && map[2][3] == player && map[3][3] == player && map[4][3] == player) return true;
    if (map[0][4] == player && map[1][4] == player && map[2][4] == player && map[3][4] == player) return true;
    if (map[1][4] == player && map[2][4] == player && map[3][4] == player && map[4][4] == player) return true;

    if (map[0][1] == player && map[1][2] == player && map[2][3] == player && map[3][4] == player) return true;
    if (map[0][0] == player && map[1][1] == player && map[2][2] == player && map[3][3] == player) return true;
    if (map[1][1] == player && map[2][2] == player && map[3][3] == player && map[4][4] == player) return true;
    if (map[1][0] == player && map[2][1] == player && map[3][2] == player && map[4][3] == player) return true;
        if (map[3][0] == player && map[2][1] == player && map[1][2] == player && map[0][3] == player) return true;
        if (map[4][0] == player && map[3][1] == player && map[2][2] == player && map[1][3] == player) return true;
        if (map[3][1] == player && map[2][2] == player && map[1][3] == player && map[0][4] == player) return true;
        if (map[4][1] == player && map[3][2] == player && map[2][3] == player && map[1][4] == player) return true;

        return false;
      }
    public static void main(String[] args) {
     createMap();
     printMap();
     while (true) {
         humanTurn();
         printMap();

         if (checkWin(human)) {
             System.out.println("Human win!");
             break;
         }
         if (isDraw()) {
             System.out.println("Is Draw!");
             break;
         }
         aiTurn();
         printMap();
         if (checkWin(ai)) {
             System.out.println("AI win!");
             break;
         }
         if (isDraw()) {
             System.out.println("Is Draw!");
             break;
         }
     }
     System.out.println("Game Over!");
    }
}
