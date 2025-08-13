import java.util.Scanner;

public class Rotate90deg {
    
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
        System.out.println("Enter "+row*column+" elemenst :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("Element of arrays : ");

        display(arr);

        System.out.println("Element of rotated array : ");
        display(rotate90deg(arr));
    }
    public static int [][] rotate90deg(int arr[][]){
        arr=transpose(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1 ,k=0;j>=k;j--,k++){
                int temp=arr[i][k];
                arr[i][k]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        return arr;
    }
    public static int[][] transpose(int arr[][]){
        if(arr.length==arr[0].length){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int temp=arr[j][i];
                    arr[j][i]=arr[i][j];
                    arr[i][j]=temp;
                }
            }
            return arr;
        }
        int arrtrans[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arrtrans.length;i++){
            for(int j=0;j<arrtrans[i].length;j++){
                arrtrans[i][j]=arr[j][i];
            }
        }
        return arrtrans;
    }
}
