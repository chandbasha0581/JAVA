import java.util.Scanner;

public class forloops1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        //System.out.println("enter the lenght of the table ");
        int n= read.nextInt();
        /*System.out.println("enter the number which table you want ");
        int m=read.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=m*i;
            System.out.println(m+"x"+i+"="+mul);
        }*
        int sum=1,diff=1,r=0,re=0;
        while(n>0){
            r=n%10;
           if(n%2==0){
               sum=sum*r;
           }
            if(n%2==1){
                diff=diff*r;
            }
            re=sum-diff;
            n=n/10;
        }

        System.out.print(re);*/
        int count = 0;            // n=7
        for (int i=1;i<=n;i++) {  // i=6     5<5
            //for (int j=i;j<n;j++) {
                if (n % i == 0) { //7 % 3
                    //System.out.println("not a prime");
                    count++; // c=1
                    //break;
                }
                //System.out.println(i);
            //}
            if (count==2){
                System.out.println(i+" ");
            }
        }

                //else System.out.println(i);
            //}



    }
}
