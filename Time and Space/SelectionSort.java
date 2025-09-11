import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter no. elements in array : ");
        int n=scn.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter "+n+" of elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Elements of array : ");
        display(arr);

        selectionSort(arr);

        display(arr);


    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,j,min)){
                    min=j;
                }
            }
            swap(arr, i,min);  

        }
    }

    public static void swap(int arr[],int i,int j){
        System.out.println("swapping "+arr[i]+" and "+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static boolean isSmaller(int arr[],int i,int j){
        System.out.println("Comparing "+arr[i]+" and "+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void display(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println();
    }
}
