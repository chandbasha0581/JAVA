/*import java.util.Scanner;

public class twisted {
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
            while(i>0){
                int r=0;
                r=i%10;
                sum=sum*10+r;
                i=i/10;
            }
            System.out.println(sum);
        }
        else System.out.println("No");
    }
}*/
import java.util.Scanner;
public class twisted {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        char n1 = 'A';
        for (int i = 1; i <= n; i++) {
            String ra = "";
            for (int j = 1; j <= i; j++) {
                ra = ra + n1 + " ";
                n1++;
            }
            System.out.println(ra);
        }
    }
}