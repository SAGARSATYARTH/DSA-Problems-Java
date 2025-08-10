// multiply two 2d arrays

import java.util.Scanner;

public class MatrixMultiplication {

    public static void display(int arr[][]){
        // System.out.println("Elements of array : ");
        for(int value[]:arr){
            for(int ele:value){
                System.out.print(ele+"   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter row of 1st array : ");
        int a1row=scn.nextInt();
        System.out.print("Enter column of 1st array : ");
        int a1column=scn.nextInt();

        System.out.println("Enter "+a1row*a1column+" element : ");
        int arr1[][]=new int[a1row][a1column];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=scn.nextInt();
            }
        }

        System.out.print("Enter row of 2nd array : ");
        int a2row=scn.nextInt();
        System.out.print("Enter column of 2nd array : ");
        int a2column=scn.nextInt();

        System.out.println("Enter "+a2row*a2column+" element : ");
        int arr2[][]=new int[a2row][a2column];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        System.out.println("Elements of array 1 : ");
        display(arr1);
        System.out.println("Elements of array 2: ");
        display(arr2);
        
        if(a1column!=a2row){
            System.out.println("Invalid input");
            return;
        }
        int arrPrd[][]=new int[a1row][a2column];
        for(int i=0;i<arrPrd.length;i++){
            for(int j=0;j<arrPrd[i].length;j++){
                for(int k=0;k<a1column;k++){
                    arrPrd[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
            
        }
        System.out.println("Elements of productArray : ");
        display(arrPrd);

        scn.close();

    }
    
    
}
