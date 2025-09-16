import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Elements of array : ");
        display(arr);
        System.out.println("After sorted : ");
        quickSort(arr,0,5);
        display(arr);

    }

    public static void display(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int pIdx=partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);


    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];

        int j=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        int temp = arr[j];
        arr[j] = arr[ei];
        arr[ei] = temp;

        return j;
    }
}
