import java.util.Scanner;

public class Binary {

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
        System.out.println(binarySearch(arr, k));

        scn.close();
    }
    public static int binarySearch(int arr[],int k){
        int min=0;
        int max=arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(k<arr[mid]){
                max=mid-1;
            }
            else {
                min=mid+1;
            }
        }
        return -1;

    }
}
