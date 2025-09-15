import java.util.Scanner;

    public class PartioningOfArray {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter no. of elements in arr : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("\nElements of Array 1 : ");
        display(arr);
        
        System.out.print("Enter pivot : ");
        int pivot=scn.nextInt();

        System.out.println("Sorted Array :");
        int result[]=partionOfArray(arr,pivot);
        display(result);
    }   

    public static int[] partionOfArray(int arr[],int pivot){

        int i=0;
        int j=0;
        while (i<arr.length) {
            if(arr[i]>pivot){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            
        }

        return arr;

    }

    public static void display(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }
}
