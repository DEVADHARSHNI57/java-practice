import java.util.Scanner;

public class MergeArray {
    Public static void main(String[] args){ 
   
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        
        for(int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];

        for(int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        int []freq = new int[256]
        for(int i = 0; i < n1; i++){
            freq[a1[i]]++;
        }
        for(int i = 0; i < n2; i++){
            freq[a2[i]]++;
        }
        for(int i =0;
            


    
}
