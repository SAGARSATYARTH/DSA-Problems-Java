import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter index : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("\nElements of array : \n");
        displayArr(arr, n);

        scn.close();
    }
    
    public static void displayArr(int arr[],int idx){
        if(idx<0){
            return;
        }
        displayArr(arr, idx-1);
        if(idx<5){
            System.out.println(arr[idx]);
        }
    }
}
