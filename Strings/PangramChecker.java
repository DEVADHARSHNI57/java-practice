//20.12.2025(Check if a string is a pangram)

import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        boolean[] mark = new boolean[26];
        int index;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
                mark[index] = true;
            }
        }

        for(int i = 0; i < 26; i++){
            if(!mark[i]){
                System.out.print("Not a Pangram");
                return;
            }
        }
        System.out.print("Pangram");
    }
    
}
