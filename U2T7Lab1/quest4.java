package U2T7Lab1;

public class quest4 {
    public static void main(String[] args) {
        String origStr = "Hello how are you today?";
        String str9 = origStr.substring(6,9);
        System.out.println(str9);

        String blah = "What's for dinner?";
        String ugh = blah.substring(11,17);
        System.out.println(ugh);

        String blah2 = "What's for dinner?";
        String ugh2 = blah2.substring(11);
        String ugh3 = blah2.substring(11, 18);
        System.out.println(ugh2);
        System.out.println(ugh3);
    }
    
}
