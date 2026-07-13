//22.12.2025(Password class - placeholder)

import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String pw = sc.nextLine();

        if(pw.length() < 8){
            System.out.println("Weak Password");
            return;
        }
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for(int i = 0; i < pw.length(); i++){
            char ch = pw.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper = true;
            } else if(ch >= 'a' && ch <= 'z'){
                lower = true;
            } else if(ch >= '0' && ch <= '9'){
                digit = true;
            } else {
                special = true;
            }
        }
        if(upper && lower && digit && special){
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
