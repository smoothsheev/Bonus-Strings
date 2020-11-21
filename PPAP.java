import java.util.Scanner;

class PPAP {
    public static void main (String[] args) {
        String s = PPAP("I have a pen, I have a apple");
        System.out.print(s);
    }
    public static String PPAP(String str) {
        
       
       
        //special cases
        
        String real = str.substring(9);
        String one = real.substring(0, real.indexOf(","));
        String two = real.substring(real.indexOf("I have a ") + 9);
        return "Uh! " + two + " " + one + "!";
        
        
        
     
    }

}