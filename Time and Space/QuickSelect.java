import java.util.Scanner;

public class QuickSelect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        System.out.println(quickSelect(arr, 0,arr.length-1, k-1));
    }

    public static int quickSelect(int arr[],int lo,int hi,int k){
        int pivot=arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        if(k>pi){
            return quickSelect(arr, pi+1, hi, k);
        }
        else if(k<pi){
            return quickSelect(arr, lo, pi-1, k);
        }
        else{
            return arr[pi];
        }
    }


    public static void swap(int arr[],int i,int j){
        System.out.println("swapping "+arr[i]+" and "+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[],int pivot,int lo,int hi){
        // int pivot=arr[ei];

        int i=lo,j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        int temp = arr[j];
        arr[j] = arr[hi];
        arr[hi] = temp;

        return (j-1);
    }
}
