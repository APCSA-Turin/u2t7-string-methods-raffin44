package U2T7_P2_MoreStringMethods;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
    // instance variables
    int score = 0; 
    int numWords = 0;
    String word1;
    String word2;

    Scanner salman = new Scanner(System.in);
    System.out.print("Enter first word: ");
    word1 = salman.nextLine();
    numWords++;

    while (score < 50) {

    System.out.print("Enter next word: ");
    word2 = salman.nextLine();

    if (word1.compareTo(word2) < 0) {
        score += 2;
        System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
       
    } if (word1.compareTo(word2) > 0) {
        score -= 5;
        System.out.println("-5 points: current word alphabetically before; SCORE: " + score);

    } if (word1.compareTo(word2) == 0) {
        score -= 10;
        System.out.println("-10 points: current word same as previous; SCORE: "+ score);

    } if (word1.substring(word1.length()-2, word1.length()).equals(word2.substring(0,2))) {
        score += 5; 
        System.out.println("+5 points: last 2 letters of previous match first two letters of current; SCORE: " + score);

    } if (word2.indexOf(word1.substring(0,1)) != -1) {
        score += 3;
        System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
    
    } if (word1.substring(0, 1).equals(word2.substring(word2.length()-1, word2.length()))) { // new rule added
        score ++;
        System.out.println("+1 point: first letter of previous word matches last letter of current; SCORE: " + score);
    }
        word1 = word2;
        numWords++;    
    }
        System.out.println("You win! It took you " + numWords + " words! Try again for a lower word count :)");
    
        salman.close();
        }
    }