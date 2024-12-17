import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        sum();
        diff();
        mul();
        div();
        even();
        perfect();
        checkeven();
        positiveno();
        elections();
    }
    public static void sum(){
        int a=10, b=30;
        System.out.println(a+b);
    }
    public static void diff(){
        int a=10, b=30;
        System.out.println(a-b);
    }
    public static void mul(){
        int a=10, b=30;
        System.out.println(a*b);
    }
    public static void div(){
        int a=30, b=3;
        System.out.println(a%b);
    }
    public static void even(){
        Scanner read= new Scanner(System.in);
        System.out.print("Enter the number"+" ");
        //int n=read.nextInt();
        if (read.nextInt()%2==0){
            System.out.println("even");
        }
        else System.out.println("odd");
    }
    public static void perfect(){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=read.nextInt();
        int c=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                c+=i;
            }
        }
        if(c==n){
            System.out.println("Prefect");
        }
        else {
            System.out.println("Not a perfect");
        }
    }
    public static void checkeven(){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=read.nextInt();
        if (n % 2==0){
            System.out.println(" Even");
        }
        else System.out.println("Not a even");
    }
    public static void positiveno(){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=read.nextInt();
        if (n >=1){
            System.out.println("Positive");
        }
        else System.out.println("Not a positive");
    }
    /*public static void vowels(){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the number");
        String n=read.next();
        char ch;
        if( ch='A' || ch='E'){
            System.out.println("Vowels");
        }
    }*/
    public static void elections(){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=read.nextInt();
        if(n==175) System.out.println("Jagan mamaia");
        else if (n>15) System.out.println("Sarmila akka");
        else if (n==20) System.out.println("Pavan kalyan");
        else System.out.println("K A poul");
    }
}
