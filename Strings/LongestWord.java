//20.12.2025(Find the longest word in a string)

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), word = "", large = "", Small = "";
        str = str + " ";

        char []c = str.toCharArray();
        String []max = new String[20];

        int n = c.length, index = 0;

        for(int i = 0; i < n; i++){
            if(c[i] != ' '){
                word += c[i];

           } else {
                max[index++] = word;
                word = "";
           }

        } 
        Small = large = max[0];
        for(int i = 1; i < index; i++){
            if(max[i].length() > large.length()){
                large = max[i];
            }

            else {
                if(max[i].length() < Small.length()){
                    Small = max[i];
                }
            }
            System.out.print("Longest word: " + large);
        }
    }
    
}
