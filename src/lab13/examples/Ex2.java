package lab13.examples;

public class Ex2 {
    public static void main(String[] args) {
    try {
        System.out.println("0");
        throw new RuntimeException("Непроверяемая ошибка");
//        System.out.println("1");    // unable to compile
    } catch (Exception e) {
        System.out.println("2 " + e);
    }
    System.out.println("3");
    }
}
