package lab11;
import java.util.List;
import java.util.stream.Collectors;


public class CapitalizedStrings {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
