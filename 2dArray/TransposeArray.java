import java.util.Scanner;

public class TransposeArray {
    
    public static void display(int arr[][]){
        for(int value[]:arr){
            for(int i:value){
                System.out.print(i+"  ");
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

        int arr[][]=new int[row][column];
        System.out.println("Enter "+row*column+" Elements : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("Element of array : ");

        display(arr);

        System.out.println("Transpose array : ");
        
        display(transpose(arr,row,column));

        scn.close();
    }
    public static int[][] transpose(int arr[][],int r,int c){
        if(r==c){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int temp=arr[j][i];
                    arr[j][i]=arr[i][j];
                    arr[i][j]=temp;
                }
            }
            return arr;
        }
        int arrtrans[][]=new int[c][r];
        for(int i=0;i<arrtrans.length;i++){
            for(int j=0;j<arrtrans[i].length;j++){
                arrtrans[i][j]=arr[j][i];
            }
        }
        return arrtrans;
    }
}
