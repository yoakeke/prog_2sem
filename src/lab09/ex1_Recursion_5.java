package lab09;

public class ex1_Recursion_5 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fact(5));
    }

    public static int fact(int n) {
        System.out.println("Вызов fact(" + n + ")");
        if (n == 0) {
            System.out.println("fact(" + n + ") возвращает 0");
            return 0;
        } else if (n == 1) {
            System.out.println("fact(" + n + ") возвращает 1");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("fact(" + n + ") возвращает " + result);
            return result;
        }
    }
}
