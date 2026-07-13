//19.12.2025(Compare two strings for equality)

import java.util.Scanner;
public class CompareStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();    
        String str2 = sc.nextLine();
        
        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();

        if(c1.length == c2.length){
            for(int i = 0; i < c1.length; i++){
                if(c1[i] != c2[i]){
                    System.out.print("Strings are not equal");
                    return;
                }
            }
            System.out.print("Strings are equal");
        } else {
            System.out.print("Strings are not equal");

        }
    } 
}  