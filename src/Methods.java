import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = read.nextInt();
        System.out.println("Enter the num2");
        int num2 = read.nextInt();
        int result = add(num1, num2);
        System.out.println("Additions of numbers"+" "+result);
        int result1 = diff(num1, num2);
        System.out.println("Difference of numbers"+" "+result1);
        int result2 = mul(num1, num2);
        System.out.println("Multiple of numbers"+ " "+result2);
        int result3 = div(num1, num2);
        System.out.println("Division of numbers"+" "+result3);
    }
    public static int add(int a,int b){
        return a+b;

    }
    public static int diff(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
}
