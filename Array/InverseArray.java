// Inverse of array

import java.util.Scanner;

public class InverseArray {

    public static void display(int arr[]){
        System.out.println("\nElements of array : \n");
        for(int value:arr){
            System.out.println(value);
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

        display(arr);
        inverse(arr, n);

        scn.close();
    }

    public static void inverse(int arr[],int n){
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            int j=arr[i];
            arr1[j]=i;
        }
        display(arr1);
        // return arr1;
    }
}
