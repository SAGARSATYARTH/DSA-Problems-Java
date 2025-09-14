import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
         
        System.out.print("Enter no. of elements in arr1 : ");
        int a1=scn.nextInt();

        int arr1[]=new int[a1];
        System.out.println("Enter "+a1+" elements : ");
        for(int i=0;i<a1;i++){
            arr1[i]=scn.nextInt();
        }

        System.out.println("\nElements of Array 1 : ");
        display(arr1);
         
        System.out.println("Sorted Array :");
        int result[]=mergeSort(arr1, 0, arr1.length-1);
        display(result);
    }

    public static int [] mergeSort(int arr[], int start ,int end){

        if(start==end){
            int ba[]=new int[1];
            ba[0]=arr[start];

            return ba;
        }

        int mid=(start+end)/2;
        int ls[]=mergeSort(arr, start, mid);
        int rs[]=mergeSort(arr, mid+1, end);
        int result[]=mergeTwoSortedArray(ls,rs);

        return result;
    }
    
    public static void display(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static int [] mergeTwoSortedArray(int arr1[], int arr2[]){
        int aL=arr1.length+arr2.length;
        int sArr[]=new int[aL];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j] && i<arr1.length){
                sArr[k]=arr1[i];
                i++;
            }
            else if(arr2[j]<arr1[i] && j<arr2.length){
                sArr[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            sArr[k]=arr1[i];
            i++;k++;
        }
        while (j<arr2.length) {
            sArr[k]=arr2[j];
            j++;k++;
            
        }


        return sArr;

    }
}
