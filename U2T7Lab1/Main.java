package U2T7Lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println("The first word, " + word1 + ", is longer than the second word, " + word2 + ".");
        } else if (word1.length() < word2.length()) {
            System.out.println("The second word, " + word2 + ", is longer than the first word, " + word1 + ".");
        } else {
            System.out.println("The words " + word1 + " and " + word2 + " have the same length.");
        }

        int mid1 = word1.length() / 2;
        String firstHalf1 = word1.substring(0, mid1);
        String secondHalf1 = word1.substring(mid1);
        System.out.println("The first word " + word1 + " is split into " + firstHalf1 + " and " + secondHalf1 + ".");

        int mid2 = word2.length() / 2;
        String firstHalf2 = word2.substring(0, mid2);
        String secondHalf2 = word2.substring(mid2);
        System.out.println("The second word " + word2 + " is split into " + firstHalf2 + " and " + secondHalf2 + ".");

        int index = word1.indexOf(word2);
        if (index != -1) {
            System.out.println(word2 + " is found in " + word1 + " at index " + index + ".");
        } else {
            System.out.println(word2 + " is NOT found in " + word1 + ".");
        }

        scanner.close();
    }
}
