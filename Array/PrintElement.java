import java.util.Scanner;

public class PrintElement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Elements in array  : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        scn.close();
    }
    
}
