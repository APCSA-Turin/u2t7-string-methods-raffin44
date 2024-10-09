package U2T7_P3;

public class Test {
    public static void main(String[] args) {
    CustomStringMethods methods = new CustomStringMethods();
  
// longerThan

boolean bool = methods.longerThan("cricket", 56);

System.out.println(bool);

/* EXPECTED OUTPUT:

false */

// funnyString

String str = methods.funnyString("prioritize", 7);

System.out.println(str);

/* EXPECTED OUTPUT:
iprioritizei */

// halvesReversed

str = methods.halvesReversed("floater");

System.out.println(str);

/* EXPECTED OUTPUT:

aterflo */

// PigLatin

str = methods.pigLatin("cricket");

System.out.println(str);

/* EXPECTED OUTPUT:

ricketcay */

// removeCharacter

str = methods.removeCharacter("Cricketer", 100);

System.out.println(str);

/* EXPECTED OUTPUT:

Cricketer */

//insertAt

str = methods.insertAt("Babar is good", "too ", "g");

System.out.println(str);

/* EXPECTED OUTPUT:

Babar is too good */

// endUp

str = methods.endUp("Joe Root, you absolute beauty!", 7);

System.out.println(str);

/* EXPECTED OUTPUT:

Joe Root, you absolute BEAUTY! */

// yellOrWhisper

str = methods.yellOrWhisper("CrickeT is the BEsT!");

System.out.println(str);

/* EXPECTED OUTPUT:

CRICKET IS THE BEST! */
 }
}
