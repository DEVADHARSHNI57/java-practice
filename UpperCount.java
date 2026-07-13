//22.12.2025(Count the number of uppercase letters in a string)

import java.util.Scanner;
public class UpperCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []c1 = str.toCharArray();
        int count = 0;

        for(int i = 0; i < c1.length; i++){
        if(c1[i] >= 'A' && c1[i] <= 'Z'){
            count++;
        }
    }
       System.out.print(count);

    }
    
}
