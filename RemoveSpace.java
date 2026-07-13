//19.12.2025(Remove all spaces from a string)

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), str1 = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                str1 = str1 + ch;
            }
        }
        System.out.print(str1);
}
}
