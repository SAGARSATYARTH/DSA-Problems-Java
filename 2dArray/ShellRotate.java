import java.util.Scanner;

public class ShellRotate {

    public static void display(int arr[][]){
        for(int value[]:arr){
            for(int i:value){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }

    public static int[][] shellRotate(int arr[][],int shell,int k){
        
        int oDarr[]=arrFromShell(arr, shell);
        rotate(oDarr, k);
        shellFromArr(arr, shell, oDarr);
        return arr;
    }
    public static int[] arrFromShell(int arr[][],int shell){
        int rMin=shell-1,cMin=shell-1,rMax=arr.length-shell,cMax=arr[0].length-shell;
        // int elements=(2*arr.length)+(2*(arr[0].length-2));
        int elements = 2 * (rMax - rMin + cMax - cMin ); 
        int count=0;

        int oDArr[]=new int[elements];
        while(count<elements){
            for(int i=rMin,j=cMin;i<=rMax;i++){ // left wall
                oDArr[count]=arr[i][j];
                count++;
            }
            cMin++;
            for(int i=cMin,j=rMax;i<=cMax;i++){ // bottom wall
                oDArr[count]=arr[j][i];
                count++;
            }
            rMax--;
            for(int i=rMax,j=cMax;i>=rMin;i--){// right wall
                oDArr[count]=arr[i][j];
                count++;
            }
            cMax--;
            for(int i=cMax,j=rMin;i>=cMin;i--){ // top wall
                oDArr[count]=arr[j][i];
                count++;
            }
            rMin++;
        }
        return oDArr;

    }
    public static int[][] shellFromArr(int arr[][],int shell,int oDArr[]){
        int rMin=shell-1,cMin=shell-1,rMax=arr.length-shell,cMax=arr[0].length-shell;
        // int elements=(2*arr.length)+(2*(arr[0].length-2));
        int elements = 2 * (rMax - rMin + cMax - cMin ); 
        int count=0;
        while(count<elements){
            for(int i=rMin,j=cMin;i<=rMax;i++){ // left wall
                arr[i][j]=oDArr[count];
                count++;
            }
            cMin++;
            for(int j=cMin,i=rMax;j<=cMax;j++){ // bottom wall
                arr[i][j]=oDArr[count];
                count++;
            }
            rMax--;
            for(int i=rMax,j=cMax;i>=rMin;i--){// right wall
                arr[i][j]=oDArr[count];
                count++;
            }
            cMax--;
            for(int j=cMax,i=rMin;j>=cMin;j--){ // top wall
                arr[i][j]=oDArr[count];
                count++;
            }
            rMin++;
        }
        return arr;

    }
    public static int[] rotate(int arr[],int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverseArr(arr, 0, arr.length-k-1);
        reverseArr(arr, arr.length-k, arr.length-1);
        reverseArr(arr, 0, arr.length-1);

        return arr;
    }
    public static int[] reverseArr(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
        return arr;
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
        System.out.print("Enter shell no : ");
        int shell=scn.nextInt();
        System.out.print("Enter rotatio : ");
        int rotation=scn.nextInt();

        System.out.println("Element of arrays : ");

        display(arr);

        System.out.println("Shell : "+shell);
        System.out.println("Rotation : "+rotation);

        System.out.println("\nElement of array after shell Rotation : ");
        display(shellRotate(arr,shell,rotation));
        scn.close();
    }
}
