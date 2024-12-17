import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" Enter the length of array");
        int len=read.nextInt();
        int arr[] =new int[len];
        System.out.println("Enter the elements of array");

        for(int i=0;i<len;i++) {
            arr[i] = read.nextInt();
        }
        int min=arr[0];
        for(int j=0;j<len-1;j++) {
            for(int k=0;k<len-1-j;k++) {
                if (arr[k+1] < arr[k]) {
                    min = arr[k];
                    arr[k] = arr[k+ 1 ];
                    arr[k+ 1] = min;
                }
            }
        }
        for(int k=0;k<len;k++) {
            if(arr[k]%2==0) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}
