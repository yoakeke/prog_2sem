package lab09;
import java.util.HashMap;
import java.util.Map;

public class ex6_HashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, "Строка " + i);
        }

        System.out.println("Строки, где ключ > 5:");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if (entry.getValue().length() > 5){
                System.out.println(entry.getValue());
            }
        }

        if (map.containsKey(0)) {
            System.out.println("Строки с ключом 0: " + map.get(0));
        }

        int result = 1;
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if (entry.getValue().length() > 5){
                result *= entry.getKey();
            }
        }
        System.out.println("Произведение ключей, где длина строки > 5: " + result);
    }
}
