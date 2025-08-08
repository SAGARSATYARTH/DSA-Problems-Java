// shorted array have duplicated element 
// find the first index of element and last 

import java.util.Scanner;

public class FirstLastIndex {
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

        System.out.print("Enter k : ");
        int k=scn.nextInt();

        display(arr);
        System.out.println();
        firstAndLastIndex(arr, k);

        scn.close();
    }
    public static void firstAndLastIndex(int arr[],int k){
        int min=0;
        int max=arr.length-1;
        int fi=-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(k==arr[mid]){
                fi=mid;
                max=mid-1;
            }
            else if(k<arr[mid]){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }

        min=0;
        max=arr.length-1;
        int li=-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(k==arr[mid]){
                li=mid;
                min=mid+1;
            }
            else if(k<arr[mid]){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        System.out.println("first index : "+fi+"\nLast index : "+li);
    }
}
