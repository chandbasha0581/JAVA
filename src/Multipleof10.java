import java.util.Scanner;

public class Multipleof10 {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt(),modulus;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("after the "+num1+" "+ num2);
    }
}
