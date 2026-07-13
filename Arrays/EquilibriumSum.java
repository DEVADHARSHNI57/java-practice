import java.util.Scanner;

public class EquilibriumSum{
         
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int first, second;
        if(n % 2 == 0){
            //for even length array
            first = sum(a, 0, n/2);
            second = sum(a, n/2, n);
        } else {
            //for odd length array
            first = sum(a,0, n/2);
            second = sum(a, n/2 + 1, n);
        }
        if(first == second){
            System.out.println("EQuaL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }

        public static int sum(int arr[], int start, int end){
            int sum = 0;
            for(int i = start; i < end; i++){
                sum= arr[i];
            }
            return sum;
        }
    }

       

