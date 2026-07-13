import java.util.Scanner;

public class Hikers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < a.length; i++){
            int curr = a[i];
                sum += curr;
                if(sum == 0 && curr < 0){
                    count1++;  
                } else if(sum == 0 && curr > 0){
                    count2++;
            }
        }
        System.out.println("HILLS " + count1);
        System.out.println("MOUNTAINS " + count2);
    }
}
