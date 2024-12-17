
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (!(num/24==0)){
            System.out.println("odd factor of 24");
        }
        else{
            System.out.println("not a odd factor of 24");
        }
    }
}