import java.util.HashMap;
import java.util.Scanner;

public class MyHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        System.out.println("Map is empty");
        System.out.println(map);

        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the key: ");
            String key = scanner.next();
            System.out.println("Enter the value: ");
            String value = scanner.next();
            map.put(key, value);
        }

        System.out.println("Size of map is: " + map.size());

        System.out.println("Map with elements");
        System.out.println(map);

        System.out.println("Key-value of the first item");
        System.out.println(map.keySet().iterator().next() + ": " + map.get(map.keySet().iterator().next()));

        map.clear();
        System.out.println("Map is empty");
        System.out.println(map);
    }
}