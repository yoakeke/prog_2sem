package lab11;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LettersOnly {

    public static List<String> getLettersOnlyStrings(List<String> strings) {
        List<String> lettersOnlyStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.matches("[a-zA-Z]+")) {
                lettersOnlyStrings.add(string);
            }
        }
        return lettersOnlyStrings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("France", "Italy7", "Spain", "Germ@ny", "Canada");
        List<String> lettersOnlyStrings = getLettersOnlyStrings(strings);
        for (String string : lettersOnlyStrings) {
            System.out.println(string);
        }
    }
}