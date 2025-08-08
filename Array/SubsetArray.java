// Print all subset of an array

import java.util.Scanner;

public class SubsetArray {
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
        System.out.println();
        subsetArrays(arr);

        scn.close();
    }

    public static void subsetArrays(int arr[]){
        for(int i=0;i<(int)Math.pow(2, arr.length);i++){
            // Convert i to binary and use 0's and 1's
            int temp=i;
            for(int j=0;j<arr.length;j++){
                int bin=temp%2;
                temp=temp/2;

                if(bin==0){
                    System.out.print("_");
                }else{
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
