import java.util.*;

public class SimpleBill {

    public static int pooriqty=0;
    public static int idliqty=0;
    public static int dosaqty=0;
    public static int upmaqty=0;
    public static int ugganiqty=0;
    public static int vadaqty=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice =1;
        do {

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
            System.out.println("Enter Your Choice:: ");
            choice =sc.nextInt();

            switch (choice)
            {
                case 1:
                    Quantity("Poori");
                    break;
                case 2:
                    Quantity("Idli");
                    break;
                case 3:
                    Quantity("Dosa");
                    break;
                case 4:
                    Quantity("Upma");
                    break;
                case 5:
                    Quantity("Uggani");
                    break;
                case 6:
                    Quantity("Vada");
                    break;
                case 0:
                    printBill();
                    break;
                default:
                    System.out.println("Wrong input..");
            }
        }while (choice!=0);
    }
    public static void Quantity(String str)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Quantity of "+str+" Plates do you want");
        int qty =sc.nextInt();
        if(str.contains("Poori"))
        {
            pooriqty +=qty;
        }
        else if (str.contains("Idli")) {
            idliqty+=qty;
        }
        else if(str.contains("Dosa"))
        {
            dosaqty+=qty;
        }
        else if (str.contains("Upma"))
        {
            upmaqty+=qty;
        }
        else if (str.contains("Uggani")) {
            ugganiqty+=qty;
        }
        else if (str.contains("Vada")) {
            vadaqty+=qty;
        }

        System.out.println("Do you want to add more quantity.. press 1");
        int updatechoice= sc.nextInt();
        if (updatechoice==1) {
           Quantity(str);
        }

    }

    public static void printBill()
    {
        int total=0;

        System.out.println("Bill Amount is  ");
        if(pooriqty>0)
        {
            int price=30;
            System.out.println("Poori "+" X "+pooriqty+" X "+price+" :: "+(pooriqty*price));
            total+=(pooriqty*price);
        }
        if(idliqty>0)
        {
            int price=30;
            System.out.println("Idli "+" X "+idliqty+" X "+price+" :: "+(idliqty*price));
            total+=(idliqty*price);
        }
        if(dosaqty>0)
        {
            int price=30;
            System.out.println("Dosa "+" X "+dosaqty+" X "+price+" :: "+(dosaqty*price));
            total+=(dosaqty*price);
        }
        if(upmaqty>0)
        {
            int price=30;
            System.out.println("Upma "+" X "+upmaqty+" X "+price+" :: "+(upmaqty*price));
            total+=(upmaqty*price);
        }
        if(ugganiqty>0)
        {
            int price=30;
            System.out.println("Uggani "+" X "+ugganiqty+" X "+price+" :: "+(ugganiqty*price));
            total+=(ugganiqty*price);
        }
        if(vadaqty>0)
        {
            int price=30;
            System.out.println("Vada "+" X "+vadaqty+" X "+price+" :: "+(vadaqty*price));
            total+=(vadaqty*price);
        }
        System.out.println("Your Final Amount will be :: "+total);
    }
}
