//19.12.2025(Count the number of words in a string)

import java.util.Scanner;

public class CountWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 1; // Change count to 0 to count spaces only

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.charAt(i) == ' '){ 
                count++;
            }
        }
        System.out.print(count);
    }   
}    
        
