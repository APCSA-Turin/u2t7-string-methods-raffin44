package U2T7_P3;
public class CustomStringMethods {

    /* this class has no instance variables */
  
    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */
    public CustomStringMethods() { }
  
  // WRITE AND TEST THE METHODS BELOW
  
    public boolean longerThan(String myString, int maxLength) {
    if (myString.length() > maxLength) {
        return true;
    } else
        return false;
    }
  
    public String funnyString(String str, int idx) {
    String character = str.substring(idx, idx + 1);  
    str = character + str + character;
    return str;
    }
  
    public String halvesReversed(String myString) {
    String firstHalf = myString.substring(0, myString.length()/2);
    String secondHalf = myString.substring(myString.length()/2, myString.length());
    myString = secondHalf + firstHalf;
    return myString;
    }

    public String pigLatin(String orig) {
    String firstLetter = orig.substring(0,1);
    orig = orig.substring(1) + firstLetter + "ay";
    return orig;
    }

    public String removeCharacter(String myString, int removeIdx) {
    if (removeIdx > myString.length()-1) {
        return myString;
    } else {
        String word1 = myString.substring(0, removeIdx);
        String word2 = myString.substring(removeIdx + 1);
        myString = word1 + word2;
        return myString; }
    }

    public String insertAt(String orig, String insertText, String searchStr) {
    if (orig.indexOf(searchStr) == -1) {
    return orig + insertText;
    } else {
      String firstWord = orig.substring(0, orig.indexOf(searchStr));
      String secondWord = orig.substring(orig.indexOf(searchStr));
      orig = firstWord + insertText + secondWord;
      return orig; 
    }
    }

    public String endUp(String myString, int numToCap) {
    if (myString.length() < numToCap) {
    myString = myString.toUpperCase();
    return myString;
    } else {
    String toCapitalize = myString.substring(myString.length() - numToCap, myString.length());
    toCapitalize = toCapitalize.toUpperCase();
    myString = myString.substring(0, myString.length() - numToCap) + toCapitalize;
    return myString;
    }
  }

    public String yellOrWhisper(String myString) {  // learned how to create a character here
    char firstCharacter = myString.charAt(0); // https://stackoverflow.com/questions/7853502/how-to-convert-parse-from-string-to-char-in-java
    if (Character.isUpperCase(firstCharacter)) {    // learned how to see if a character is uppercase here
    myString = myString.toUpperCase();              // https://www.educative.io/answers/what-is-characterisuppercase-in-java
    } else {
    myString = myString.toLowerCase();
    }
    return myString;
  }
}