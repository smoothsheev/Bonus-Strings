import java.util.Scanner;

class palindrome {
    public static void main (String[] args) {
        boolean s = Palindrome();
        System.out.print(s);
    }
    public static boolean Palindrome() {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s =  str.length();
        String v2 = "";
        //delete symbols and make lower case
        str = str.toLowerCase();
        for (int i = 0; i <= s; i++) {
          if (Character.isLetter(i)) {
            String let = str.substring(i);
            v2 = v2 + let;  
            }
        }
        
        //palindrome checker
        for (int i = 0; i <= s/2; i++) {
            char first = str.charAt(i);
            char last = str.charAt(s - 1 - i);
            if (first != last) {
             return false;   
        }
    }
    return true;
}
}
