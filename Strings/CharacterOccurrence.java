//19.12.2025(Count the occurrence of a character in a string)   

import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []c1 = str.toCharArray();
        int []freq = new int[256];

        for(int i = 0; i < c1.length; i++){
            freq[c1[i]]++;
        }
        for(int i = 0; i < str.length() ; i++){
            if( freq[c1[i]] != 0 ){                //or if( freq[c1[i]] > 0 ){
                System.out.println(c1[i] + "-" + freq[c1[i]]);
                freq[c1[i]] = 0;
            }
        }

    }
    
}
