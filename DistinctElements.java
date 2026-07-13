import java.util.Scanner;

public class DistinctElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int a[] = new int[n];
        //jint count = 0;
        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max, min;
        max = min = a[0];

        for(int i = 1; i < n; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
        }
        int l = -min;
        int b[] = new int[max + l + 1];
        for(int i = 0; i < n; i++){
           
            b[a[i] + l]++;
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(b[l + a[i]] > 0){
                count++;
                b[l + a[i]] = 0;
            }
        }
        System.out.println(count);
    }
}

        

      