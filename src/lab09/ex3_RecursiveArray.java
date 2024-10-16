package lab09;
import java.util.Scanner;

public class ex3_RecursiveArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = readPositiveArraySize();
        int[] array = new int[size];
        readArray(array, 0);
        System.out.println("Введенный массив:");
        printArray(array, 0);
    }

    private static int readPositiveArraySize() {
        int size;
        while (true) {
            size = readInt("Введите размер массива: ");
            if (size < 0) {
                System.out.println("Ошибка: размер массива не может быть отрицательным.");
            } else {
                break;
            }
        }
        return size;
    }

    private static void readArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        array[index] = readInt(String.format("Введите элемент №%d: ", index + 1));
        readArray(array, index + 1);
    }

    private static void printArray(int[] array, int index) {
        if (index == array.length) {
            System.out.println();
            return;
        }
        System.out.print(array[index] + " ");
        printArray(array, index + 1);
    }

    private static int readInt(String message) {
        int number;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число.");
                scanner.next();
            }
        }
        return number;
    }
}
