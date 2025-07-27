// Take input a number t, and then take t numbers of input n , and then check all the n number are prime or not. 

import java.util.Scanner;

public class PrimeChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter t : ");   
        int t=sc.nextInt();

        // System.out.println();
        for(int i=1;i<=t;i++){ // starting from 1 and run till t
            System.out.print("Enter n : ");
            int n=sc.nextInt();
            int count=0;
            for(int j=2;j*j<=n;j++){ // starting from 1 and run till j*j
                if(n%j==0){ // if n divided by j means it is not prime 
                    count++;
                    break; // break the loop 
                }
            }
            if(count==0){
                System.out.println(n+" is Prime Number");
            }
            else{
                System.out.println(n+" is Not prime");
            }
        }

    }
}