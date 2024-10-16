package lab11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongStrings {
    public static List<String> getLongStrings(List<String> strings, int minLength) {
        List<String> longStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > minLength) {
                longStrings.add(string);
            }
        }
        return longStrings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cloud", "server", "database", "network", "AI", "blockchain", "quantum");
        int minLength = 7;
        List<String> longStrings = getLongStrings(strings, minLength);
        for (String string : longStrings) {
            System.out.println(string);
        }
    }
}
