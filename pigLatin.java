import java.util.Scanner;

class pigLatin {
    public static void main (String[] args) {
        System.out.println("Start");
        //String a = pigLatin("big");
        String b = pigLatin("big fat");
        //System.out.println(a);
        System.out.println(b);
    }

    public static String pigLatin(String str) {
        String first;
        String complete = "";
        String word = "";       

        int i = 0; 
        while (i <= str.length() - 1) {
            if (str.indexOf(" ") > 0) {
            word = str.substring(i, str.indexOf(" "));
            System.out.println(word);
            first = word.substring(0, 1); 
            System.out.println(first);
            String front = word.substring(1);
            String newWord = front + first + "ay";
            complete = complete + newWord + " ";    
            i += word.length() + 1;   
            } else
            word = str.substring(i);
            first = word.substring(0, 1); 
            String front = word.substring(1);
            String newWord = front + first + "ay";
            complete = complete + newWord + " "; 
            i = str.length() - 1;
            
        }       
        return complete;     
    }

}
