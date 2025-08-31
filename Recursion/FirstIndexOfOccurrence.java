import java.util.Scanner;

public class FirstIndexOfOccurrence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter index : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter k : ");
        int k=scn.nextInt();
        System.out.println("at index : "+firstOccurrence(arr, 0 ,k));

        scn.close();
    }

    public static int firstOccurrence(int arr[],int idx,int k){
        if(arr.length==idx){
            return -1;
        }
        if(arr[idx]==k){
            return idx;
        }
        return firstOccurrence(arr, idx+1, k);
    }
    
}
