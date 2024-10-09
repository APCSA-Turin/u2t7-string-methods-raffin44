package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        if ((word1.equals(word2))){
            System.out.println("The Words are equal!");
        } else{
            System.out.println("Words are not equal!");
        }

        if(word1.compareTo(word2)<0){
            System.out.print("The word "+ word1+ " comes before "+ word2+ " alphabetically!");
        }else if(word1.compareTo(word2)>0){
            System.out.print("The word "+ word2+" comes before "+ word1+ " alphabetically!");
        }else{
            System.out.print("The words are the same!");
        }
        scanner.close();
    }
}