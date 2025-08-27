import java.util.Scanner;
public class PrintReverseArray {
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
        displayReverseArray(arr, n);

        scn.close();
    }
    
    public static void displayReverseArray(int arr[],int idx){
        if(idx<0){
            return;
        }
        if(idx<5){ 
            System.out.println(arr[idx]);
        }
        displayReverseArray(arr, idx-1);
    }
}
