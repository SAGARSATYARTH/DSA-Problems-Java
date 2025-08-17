// Print 1 to n in Increasing order

import java.util.Scanner;

public class PrintIncreasingOrder {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        increasingOrder(n);
    }
    public static void increasingOrder(int n){
        if(n==0){
            return;
        }
        increasingOrder(n-1);
        System.out.println(n);
    }   
}
