// You are given a number n,representing the count of elements.
//you are given n numbers
//You are required to find the span of input.
// Span is defined as difference of maximum value and  minimum value.

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Difference is : "+(max-min));
        sc.close();
    }
}
