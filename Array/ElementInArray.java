/* You are given a number n,representing the size of array a.
you are given nnumbers , representing elements of array a.
you are given another number d.
you are required to check  if d number exists in the array a and  at what  index (0 based). If found print the index,otherwise print -1.
 */
import java.util.Scanner;

public class ElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter d : ");
        int d=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                index=i;
            }
        }
        if(index==-1){
            System.out.println(index+","+d+" not in array");
        }else{
            System.out.println(d+" is at index "+index);
        }
        
        sc.close();
    }
    
}
