// Print 1 to n in Increasing order

import java.util.Scanner;

public class PrintIncreasingOrder {
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
        decreasingOrder(n-1);
        System.out.println(n);
    }   
}
