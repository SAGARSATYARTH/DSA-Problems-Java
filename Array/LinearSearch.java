import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int l=scn.nextInt();

        int arr[]=new int[l];

        System.out.println("Enter elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Enter key : ");
        int key=scn.nextInt();

        System.out.println("Index : "+linearSearch(arr, key));

        scn.close();

    }
    
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }   
        return -1;
    }
}
