import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = read.nextInt();
        int temp = num, r = 0, sum = 0;
        String s = Integer.toString(num);
        int len = s.length();
        while (num>0) {
            r = num % 10;
            sum = (int) (sum + Math.pow(r, len));
            len--;
            num = num / 10;
        }
        num = temp;
        if(sum==num) System.out.println("The given number is : Yes it is disarium number "+sum);
        else System.out.println(" The given number is : Not a disarium number");
    }
}
