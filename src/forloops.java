import java.util.Scanner;
public class forloops {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" Enter the no of Array");
        int len= read.nextInt();
        int arr[]=new int[len]; // enter the length of array
        System.out.println(" Enter the array elements");
        int k=0;
        while(k<len){
            arr[k]= read.nextInt(); // enter the array elements
            k++;
        }
        int i = 0;
        while(i<len) {
            int j=1,n=arr[i],sum=0;
            while(j<n) {
                if (n % j == 0) {
                    sum=sum+j;
                }
                j++;
            }
            if (sum==arr[i]) System.out.print(sum+" ");
            else System.out.println(" Not a perfect number");
            i++;
        }
    }
}

