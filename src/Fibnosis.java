import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibnosis {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num= read.nextInt();
        int n1=0,n2=1;
        System.out.print(n1+" "+n2);
        int n3=0,i=2;
        while(num>i){
            n3=n1+n2;
            System.out.print(" "+n3);
            i++;
            n1=n2;
            n2=n3;

        }
    }
}
