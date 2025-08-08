/* you are given a number n,representing the size of array
   you are given n numbers ,representing elements  of array
   you are given a number k 
   rotate the  array ,k times  to the right (for +ve value of k ) and to the left for -ve value of k.
 */
import java.util.Scanner;

public class RotateArray {
    public static void display(int arr[]){
        System.out.println("\nElements of array : \n");
        for(int value:arr){
            System.out.println(value);
        }
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter rotation time : ");
        int k=scn.nextInt();
        display(arr);
        rotate(arr, n, k);
        display(arr);

        scn.close();
    }



    // case:1
    /*public static void rotate(int arr[],int n,int k){
        k=k%n;
        if(k<0){
            k=k+n;
        }
        while(k>0){
            int j=n-1;
            int temp=arr[j];
            while(j>0){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
            k--;
        }
    }*/
    // case :2
    public static void rotate(int arr[],int n,int k){
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(arr,0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    
}
