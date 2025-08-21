// print all elements of 2D array
import java.util.*;
public class PrintElements {

    public static void display(int arr[][]){
        for(int value[]:arr){
            for(int i:value){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row : ");
        int n=scn.nextInt();
        System.out.print("Enter column : ");
        int m=scn.nextInt();

        int arr[][]=new int [n][m];
        System.out.println("Enter "+ n*m +" elements :");
        for(int i=0;i<arr.length;i++){// length of row only
            for(int j=0;j<arr[i].length;j++){// length of i(0) row
                arr[i][j]=scn.nextInt();
            }
    
        }
        display(arr);


        scn.close();
    }
}
