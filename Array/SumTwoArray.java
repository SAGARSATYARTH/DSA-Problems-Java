// Sum of Two array

import java.util.Scanner;

public class SumTwoArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter arr 1 size : ");
        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter "+n1+" numbers :");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }

        System.out.print("Enter arr 2 size : ");
        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter "+n2+" numbers :");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }

        int sum[]=new int[n1>n2?n1:n2];
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        while(k>=0){
            int d=carry;
            if(i>=0){
                d=d+arr1[i];
            }
            if(j>=0){
                d=d+arr2[j];
            }
            carry=d/10;
            d=d%10;
             
            sum[k]=d; 

            i--;
            j--;
            k--;
        }
        System.out.println("-----------");
        if(carry!=0){
            System.out.println(carry);
        }
        for(int value:sum){
            System.out.println(value);
        }
        
        scn.close();
    }
    
}
