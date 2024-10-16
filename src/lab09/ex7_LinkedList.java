package lab09;
import java.util.LinkedList;

public class ex7_LinkedList {
    public static void main(String[] args) {
        int N = 10;
        LinkedList<Integer> people = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index++;
            index = (index - 1) % people.size();
            people.remove(index);
        }

        System.out.println("Победитель (LinkedList): " + people.get(0));
    }
}
