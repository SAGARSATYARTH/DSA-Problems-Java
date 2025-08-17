// Print the factorial of the n.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        System.out.println("Factorial of "+n+" is : "+fact(n));
    }   

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
