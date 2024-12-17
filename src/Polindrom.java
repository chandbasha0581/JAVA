import java.util.Scanner;
public class Polindrom {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int t=num,r=0,sum=0;
        while(num>0){
            r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        System.out.println(sum);

    }
}
