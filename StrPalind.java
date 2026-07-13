import java.util.Scanner;

public class StrPalind {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();
        char[] c = str.toCharArray();
        for(int i = 0; i < n / 2; i++){
            if(c[i] != c[n - i - 1]){
                System.out.print("Not a Palindrome");
                return;
            }
        }
        System.out.print("Palindrome");
    } 
    
}
