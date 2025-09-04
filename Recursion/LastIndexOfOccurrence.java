import java.util.Scanner;

public class LastIndexOfOccurrence {
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
        System.out.println("at index of  : "+lastOccurrence(arr, 0 ,k));

        scn.close();
    }

    public static int lastOccurrence(int arr[],int idx,int k){
        if(arr.length==idx){
            return -1;
        }
        int lo= lastOccurrence(arr, idx+1, k);
        if(lo != -1){
            return lo; 
        }
        else if(arr[idx]==k){
            return idx;
        }else{
            return -1;
        }
    }

   
    
   

    
}
