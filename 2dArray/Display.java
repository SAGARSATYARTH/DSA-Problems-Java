// n=row,m=column , n*m = elements of array ,display all element
import java.util.*;
public class Display {

    public static void display(int arr[][],int n,int m){
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

        display(arr, n, m);
    }
}
