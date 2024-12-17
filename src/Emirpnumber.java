import java.util.Scanner;

public class Emirpnumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int sum=0;
        int i=2,count=0;
        while(num>i){
            if(num % i == 0){
                count++;
            }
            i++;
        }
        if (count==0) {
            while (i > 0) {
                int r = 0;
                r = i % 10;
                sum = sum * 10 + r;
                i = i / 10;
            }
        }
        if (sum==num) System.out.println("NO");
        else System.out.println(sum);
    }
}
