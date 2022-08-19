import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        char ch;
        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentence to check:");
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("The string in reverse is: " + reverse);
    }
}
