// given - shorted array
// given k = element of array then ceil and floor = element
// given k = lies btw and two element then greater element will be ciel and smaller one will be floor

import java.util.Scanner;

public class CeilFloor {
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
        cielFloor(arr, k);

        scn.close();
    }
    public static void cielFloor(int arr[],int k){
        int min=0;
        int max=arr.length-1;
        int ceil=0;
        int floor=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(k==arr[mid]){
                ceil=mid;
                floor=mid;
                break;
            }
            if(k<arr[mid]){
                max=mid-1;
                ceil=mid;
            }
            else{
                min=mid+1;
                floor=mid;
            }
        
        }
        System.out.println(arr[floor]+" is floor,"+arr[ceil]+" is ceil");
    }    
}
