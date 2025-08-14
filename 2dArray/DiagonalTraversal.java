// print 2d array upper diagonally
import java.util.Scanner;

public class DiagonalTraversal {
    public static void display(int arr[][]){
        for(int value[]:arr){
            for(int i:value){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row : ");
        int row=scn.nextInt();
        System.out.print("Enter column : ");
        int column=scn.nextInt();

        System.out.println("Enter "+row*column+" elements : ");
        int arr[][]=new int [row][column];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("Elements of array : ");
        display(arr);

        System.out.println("Elements of Diagonal : ");
        diagonalTraverse(arr);

         scn.close();
    }
    public static void diagonalTraverse(int arr[][]){
        for(int gap=0;gap<arr.length;gap++){
            for(int i=0 ,j=gap;j<arr.length;j++ ,i++){
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
