import java.util.Scanner;

public class Neonnumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = read.nextInt();
        int r=0,sum=0;
        r+=Math.pow(num,2);
        System.out.println(r);
        int temp=r,re=0;
        while (r>0){
            re=r%10;
            sum+=re;
            r=r/10;
        }
        if (sum==num) System.out.println(sum);
        else System.out.println("No a Neon number");
    }
}
