
import java.util.Scanner;

public class INCREMENT {
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,s=1,temp=n,count=0,j=1,r; //n=1024
        while (n>0){
            n=n/10;   //n102
            count +=1 ;    //c=1+1=2+1=3+1=4
        }
        n=temp;
        while(n!=0){
            r=n%10;
            for(i=1;i<=count;i++){
                j=j*r;

            }
            s=s+j;
            n=n/10;
        }
        if(temp==s){
            System.out.println("armstrong");
        }
        else{
            System.out.println("Not a armstrong");
        }
    }
}
