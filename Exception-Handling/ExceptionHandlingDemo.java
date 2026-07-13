// This program demonstrates exception handling in Java by performing division and string length operations.
//import java.util.Scanner;
public class ExceptionHandlingDemo {
    public static void main(String [] args){
        //Scanner sc = new Scanner(System.in);
       
        try{
            //int n = sc.nextInt();
            int a[] = new int[5];
            System.out.println(a[7]);
        }   
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }
          
    }
}
