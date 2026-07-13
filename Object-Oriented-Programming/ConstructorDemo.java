class Calculator{
    int num1;
    int num2;
    int num3;
    Calculator(int a, int b){
        this.num1 = a;
        this.num2 = b;   
    }
    Calculator(int a, int b, int c){
        this.num1 = a;
        this.num2 = b;
        this.num3 = c;
    }
    public void add(){
        int result = this.num1 + this.num2 + this.num3;
        System.out.println("The sum is: " + result);
    }
}
public class ConstructorDemo{
    public static void main(String [] args){
        Calculator calc = new Calculator(10,20,30);
        calc.add();

    }
}
