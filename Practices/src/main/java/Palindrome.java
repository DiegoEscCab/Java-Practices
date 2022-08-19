import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        char ch;
        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentence to check:");
        String sentence = scanner.nextLine();

        for (int i = 0;i<sentence.length();i++){
            ch = sentence.charAt(i);
            reverse = ch + reverse;
            System.out.println("The number of characters are: "+ (i+1));
        }

        if (sentence.equals(reverse)){
            System.out.println("It's palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }

        System.out.println(reverse);
    }
}
