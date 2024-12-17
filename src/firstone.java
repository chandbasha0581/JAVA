import java.util.Scanner;

public class firstone {

    public static void Poori()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Quantity :: ");
        int qty=sc.nextInt();
        int z=qty*30;
        System.out.println("1. Add more");
        System.out.println("Press any key for menu");
        int admor=sc.nextInt();
        if(admor==1)
            Poori();
        else
            menue();
    }

    public static void menue()
    {
        System.out.println("*********************************************");
        System.out.println("            "+"WELCOME TO HOTEL");
        System.out.println("*********************************************");
        System.out.println("         "+"1  Poori  -  30");
        System.out.println("         "+"2  Idli   -  30");
        System.out.println("         "+"3  Dosa   -  35");
        System.out.println("         "+"4  Upma   -  30");
        System.out.println("         "+"5  Uggani -  35");
        System.out.println("         "+"6  Voda   -  35");
        System.out.println("*********************************************");
    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        menue();
        System.out.print("Enter your Choice in Number :: ");
        int choice=sc.nextInt();
       /* switch (choice)
        {
            case 1:
                Poori();
                break;
            default:
                System.out.println("Wrong input");
                break;
        }*/
        //items();

        if (choice==1){
            //System.out.print("Enter nuber how many you want : ");
            //int a = sc.nextInt();
            Poori();
            //int z=a*30;
            //System.out.println("The total cost of Poori : "+z);
        }
        else if (choice==2){
            System.out.print("Enter number how many you want : ");
            int a = sc.nextInt();
            int z=a*30;
            System.out.println("The total cost of Idli : "+z);
        }
    }
    public static void items(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the item you want ? ");
        int n = read.nextInt();

        int a ;
        int z;
        if (n==1){
            System.out.print("Enter nuber how many you want : ");
            a = read.nextInt();
            z=a*30;
            System.out.println("The total cost of Poori : "+z);
        }
        else if (n==2){
            System.out.print("Enter number how many you want : ");
            a = read.nextInt();
            z=a*30;
            System.out.println("The total cost of Idli : "+z);
        }
        else if (n==3){
            System.out.print("Enter number how many you want : ");
            a = read.nextInt();
            z=a*35;
            System.out.println("The total cost of Dosa : "+z);
        }
        else if (n==4){
            System.out.print("Enter number how many you want : ");
            a = read.nextInt();
            z=a*30;
            System.out.println("The total cost of Upma : "+z);
        }
        else if (n==5){
            System.out.print("Enter number how many you want : ");
            a = read.nextInt();
            z=a*35;
            System.out.println("The total cost of Uggani : "+z);
        }
        else if (n==6){
            System.out.print("Enter number how many you want : ");
            a = read.nextInt();
            z=a*35;
            System.out.println("The total cost of Voda : "+z);
        }
        else System.out.println("Not valid number");
        System.out.println("Total amount ");
    }
}
