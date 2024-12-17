import java.util.Scanner;
public class vowel {
    public static void main(String[] args){
        char cha;
        Scanner scanner = new Scanner(System.in);
        cha = scanner.next().charAt(0);  //a,e,i,o,u
        if (cha=='a' || cha=='e' || cha=='i' ||cha=='o' || cha=='u'){
            System.out.println("This is a vowel");
        }
        else {
            System.out.println("This is not a vowel");
        }
    }
}
