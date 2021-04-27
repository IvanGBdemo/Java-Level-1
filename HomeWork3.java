import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        int[] replacingAnArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (replacingAnArray[i] == 0) {
                replacingAnArray[i] = 1;
            } else {
                replacingAnArray[i] = 0;
            }
        }
        System.out.println("Ответ на задание 1: " + Arrays.toString(replacingAnArray));
        System.out.println("********************");

        System.out.println("Ответ на задание 2:");
        int[] fillingInAnEmptyArray = new int[100];
        for (int i = 0; i < 100; i++) {
            fillingInAnEmptyArray[i] = i + 1;
            System.out.print("fillingInAnEmptyArray[" + i + "] = " + fillingInAnEmptyArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println("********************");

        System.out.println("Ответ на задание 3:");
        int[] arrayTwelve = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arrayTwelve[i] < 6) {
                arrayTwelve[i] *= 2;
                System.out.print("arrayTwelve[" + i + "] = " + arrayTwelve[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("********************");

        int counter = 8;
        int[][] table = new int[counter][counter];
        diagonalArray(table);
        printTable("Ответ на задание 4: ", table);

    System.out.println("********************");

    int[] unknownArrayFromMethod = unknownArray(5, 6);
    printArray("Ответ на задание 5",unknownArrayFromMethod);

    System.out.println("********************");

    int[] maximumAndMinimumArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    printArray("Ответ на задание 6: Массив",maximumAndMinimumArray);
        System.out.println("Минимум: " + minimumArray(maximumAndMinimumArray));
        System.out.println("Максимум: " + maximumArray(maximumAndMinimumArray));
    }

    // Вспомогательные методы:

    public static void diagonalArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i][i] = 1;
        arr[i][arr.length - 1 - i] = 1;
        }
        }

    public static void printTable(String msg, int[][] inputArray) {
    System.out.println(msg);
    for (int i = 0; i < inputArray.length; i++) {
        for (int j = 0; j < inputArray[i].length; j++) {
        System.out.print(inputArray[i][j] + " ");
        }
        System.out.println();
        }
    }

    public static int[] unknownArray(int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }
    public static void printArray(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    private static int minimumArray(int[] array) {
        int min = array[0];
        for (int index : array)
            if (index < min) {
                min = index;
            }
        return min;
    }
    public static int maximumArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

