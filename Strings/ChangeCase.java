//19.12.2025(Change the case of a character at a specific position in a string)

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(4);
        
        if(ch >= 'a' && ch <= 'z'){
            System.out.print((char)(ch - 32));
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.print((char)(ch + 32));
        } else {
            System.out.print(ch);
        }
    }
}