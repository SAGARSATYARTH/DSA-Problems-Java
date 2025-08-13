/*  row=4,column=4
start travesing towards east until u get 1 ,if get 1 then take 90deg right.
0  0  1  0
1  0  0  0
0  0  0  0
1  0  1  0
Exit Point : 1,3
 */
import java.util.*;
public class ExitPointMatrix {

    public static void display(int arr[][]){
        System.out.println("Elemwnt of arrays : ");
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
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        display(arr);

        System.out.print("Exit Point : ");
        exitPointMatrix(arr);


    }
    public static void exitPointMatrix(int arr[][]){
        int dir=0;
        int i=0;
        int j=0;
        while(true){
            dir=(dir+arr[i][j])%4;

            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else if(dir==3){
                i--;
            }


            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.print(i+","+j);
    }
    
}
