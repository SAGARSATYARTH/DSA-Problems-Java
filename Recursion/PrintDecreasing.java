// Print n to 1 in decreasing order

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        decreasingOrder(n);
    }
    public static void decreasingOrder(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingOrder(n-1);
    }
    
}
