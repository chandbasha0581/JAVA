import java.util.Scanner;

public class sequence {
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,s,j;
        for ( i=1; i<=n; i++) {
            for(s=1; s<=n; s++){
                System.out.print(s);
            }

            for(j=1; j<=n; j++){
                System.out.print(+j);

            }
            System.out.println();
        }
    }
}
