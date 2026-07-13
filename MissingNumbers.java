import java.util.Scanner;

public class MissingNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int d = (a[n - 1] - a[0]) / n;
            for(int i = 0; i < n; i++){
                if(a[i] != a[0] + i * d){
                    System.out.println(a[0] + i * d);
                    return;
                }
            }
            System.out.println("No missing elements");
        
        }
    }
                