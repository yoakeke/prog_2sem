package lab09;
import java.util.Scanner;

public class ex2_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = 0;
        while (true) {
            System.out.print("Введите десятичное число: ");
            if (scanner.hasNextInt()) {
                decimalNumber = scanner.nextInt();
                break;
            }
            else {
                System.out.println("Ошибка: введите корректное десятичное число.");
                scanner.next();
            }
        }
        String binaryString = decimalToBinary(decimalNumber);
        System.out.println("Двоичное представление числа: " + binaryString);
    }
    private static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        int remainder = decimalNumber % 2;
        return decimalToBinary(decimalNumber / 2) + remainder;
    }
}