// Create a HashMap class base collection class that is used to store key-value pairs.
// Follow the below steps to create a HashMap class.
// Map is empty
// Size of map is -3

import java.util.HashMap;
import java.util.Scanner;

public class MyHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        // Show me the hashmap empty
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

        // Show me the size of the map
        System.out.println("Size of map is: " + map.size());

        // Show me the hashmap with elements like an object
        System.out.println("Map with elements");
        System.out.println(map);

        // Show me the key-value of the first item
        System.out.println("Key-value of the first item");
        System.out.println(map.keySet().iterator().next() + ": " + map.get(map.keySet().iterator().next()));

        // Delete all elements from the map and show me the map empty
        map.clear();
        System.out.println("Map is empty");
        System.out.println(map);
        }
    }