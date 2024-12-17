import java.util.Scanner;
public class Dectobin {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int binary=0,decimal=num;
        while (num > 0) {

            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        System.out.println("Binary representation of " + decimal + " is: " + binary);
    }


}
