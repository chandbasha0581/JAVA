//import java.time.Month;
import java.util.Scanner;

public class Monthdate {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int month=sc.nextInt();
        if (month==1){
            System.out.println("31");
        }
        else if (month==2) {
            System.out.println("20 or 29");
        }
        else if (month==3) {
            System.out.println("31");
        }
        else if (month==4) {
            System.out.println("30");
        }
        else if (month==5) {
            System.out.println("31");
        }
        else if (month==6) {
            System.out.println("30");
        }
        else if (month==7) {
            System.out.println("31");
        }
        else if (month==8) {
            System.out.println("31");
        }
        else if (month==9) {
            System.out.println("30");
        }
        else if (month==10) {
            System.out.println("31");
        }
        else if (month==11) {
            System.out.println("30");
        }
        else if (month==12) {
            System.out.println("31");
        }
        else{
            System.out.println("Invalid Number");
        }

    }
}
