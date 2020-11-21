import java.util.Scanner;

class decToBin {
    public static void main (String[] args) {
        String s = decToBin();
        System.out.print(s);
    }
    public static String decToBin() {
        int rem;
        String bin = "";
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        while (num >= 1) {
        rem = num % 2;
        num = num / 2;
        bin = rem + bin;   
    }
      
        return bin;
        
        
        
     
    }

}
