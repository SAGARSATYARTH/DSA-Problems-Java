import java.util.*;
public class SaddlePoint {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row : ");
        int row=scn.nextInt();
        System.out.print("Enter column : ");
        int column=scn.nextInt();

        int arr[][]=new int[row][column];
        System.out.println("Enter "+row*column+" elements : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Element of array : ");
        display(arr);
        System.out.println("Saddle Point ");
        saddlePoint(arr);

        scn.close();


    }
    public static void display(int arr[][]){
        for(int value[]:arr){
            for(int i:value){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }

    public static void saddlePoint(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int svj=0;
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][svj]){
                    svj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid Input");
    }
}
