package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Ответ на задание 1:" + checkSummBoolean(-2,7));
        System.out.println("********************");

        intPositiveOrNegative(50);
        System.out.println("********************");

        String result;
        result = (aPositiveOrNegative(-10)) ? "true" : "false";
        System.out.println(result);
        System.out.println("********************");

        printString("String e" , 4);
        System.out.println("********************");

        int currentf = 2298;
        System.out.println("Год " + currentf + ": " + leapYear(currentf));
      }

    public static boolean checkSummBoolean(int a, int b) {
        return (20 >= a + b && a + b >= 10);
    }

    public static void intPositiveOrNegative(int c) {
           if (0 > c) {
            System.out.println("отрицательное число");
        } else
            System.out.println("положительное число");
    }

    public static boolean aPositiveOrNegative(int d) {
        return d <= 0;
        }

    public static void printString(String c, int d) {
        for (int i = 0; i < d; i++) {
            System.out.println(c);
        }
    }
    public static boolean leapYear(int f) {
        return  (f % 4 == 0) && (f % 100 != 0) || (f % 400 == 0);
    }
}