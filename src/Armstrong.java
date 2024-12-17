import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num= read.nextInt();
        int t=num,c=0,sum=0,r=0;
        while (num>-0){
            num=num/10;
            c++;
        }
        num=t;
        while(num>0){
            r=num%10;
            sum+=Math.pow(r,c);
            num=num/10;
        }
        if(sum==t){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
