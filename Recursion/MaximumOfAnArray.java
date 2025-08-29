import java.util.Scanner;
public class MaximumOfAnArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter index : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Mamimum in array : "+maximumOfAnArray(arr, 0));

        scn.close();
    }
    
    public static int maximumOfAnArray(int arr[],int idx){

        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }
        int max=maximumOfAnArray(arr, idx+1);
        if(arr[idx]>max){
            max=arr[idx];
        }
        return max;
    }
}

