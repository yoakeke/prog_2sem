package lab09;
import java.util.ArrayList;

public class ex7_ArrayList {
    public static void main(String[] args) {
        int N = 10;
        ArrayList<Integer> people = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index++;
            index = (index - 1) % people.size();
            people.remove(index);
        }

        System.out.println("Победитель (ArrayList): " + people.get(0));
    }
}
