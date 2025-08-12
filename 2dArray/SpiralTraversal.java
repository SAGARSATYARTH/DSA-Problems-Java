import java.util.Scanner;

public class SpiralTraversal {
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

        System.out.println("Elements of Spiral : ");
        spiralTraversal(arr,row,column);

         scn.close();
    }
    public static void spiralTraversal(int arr[][],int n,int m){
        int rMin=0;
        int cMin=0;
        int rMax=arr.length-1;
        int cMax=arr[0].length-1;

        int elements=n*m;
        int count=0;
        while(count<elements){
            for(int i=rMin,j=cMin;i<=rMax && count<elements;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            cMin++;
            
            for(int i=cMin,j=rMax;i<=cMax && count<elements;i++){
                System.out.println(arr[j][i]);
                count++;

            }
            rMax--;

            for(int i=rMax,j=cMax;i>=rMin && count<elements;i--){
                System.out.println(arr[i][j]);
                count++;

            }
            cMax--;

            for(int i=cMax,j=rMin;i>=cMin && count<elements;i--){
                System.out.println(arr[j][i]);
                count++;

            }
            rMin++;
        }
        
    }
    
}
