// Print n to 1 in decreasing order and back ot n.

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        decreasingIncrease(n);
    }
    public static void decreasingIncrease(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingIncrease(n-1);
        System.out.println(n);
    }
}
