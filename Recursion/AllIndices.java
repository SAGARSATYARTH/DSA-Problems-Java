import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter no.of elements in array : ");
        int idx=scn.nextInt();

        int arr[]=new int[idx];

        System.out.println("Enter "+idx+" elements :");
        for(int i=0;i<idx;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Enter element : ");
        int ele=scn.nextInt();

        System.out.println(ele+" at Indices : ");
        int arr1[]=allIndices(arr,ele,0,0);
        for(int i:arr1){
            System.out.println(i);
        }
    }   

    public static int[] allIndices(int arr[],int ele,int idx,int fsf){

        if(arr.length==idx){
            return new int[fsf]; 
        }
        if(arr[idx]==ele){
            int fsfArr[]=allIndices(arr, ele, idx+1, fsf+1);
            fsfArr[fsf]=idx;
            return fsfArr;
        }
        else{
            int fsfArr[]=allIndices(arr, ele, idx+1, fsf);
            return fsfArr;
        }
    } 

}
