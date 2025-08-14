// search element in sorted array.

import java.util.*;;
public class SearchElement {
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
        System.out.print("Enter k : ");
        int k=scn.nextInt();

        System.out.println("Elements of array : ");
        display(arr);
        System.out.println("Element in array : ");
        searchElement(arr,k);

        scn.close();


    }
    public static void searchElement(int arr[][],int k){
        int i=0;
        int j=arr[0].length-1;
        while (i<arr.length && j>=0) {
            if(k==arr[i][j]){
                System.out.println(i+","+j);
                return;
            }
            else if(k<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
    public static void display(int arr[][]){
        for(int value[]:arr){
            for(int i:value){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }

}
