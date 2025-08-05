// You are a number n and b1 is the base of n, then convert the number into its corresponding value in base b2.

import java.util.Scanner;

public class AnybaseToDecimal {
    public static int baseToDecimal(int num,int b){
        int count=0;
        int decNum=0;
        while(num>0){
            int rem=num%10;
            count++;
            decNum+=rem*Math.pow(b,count-1);
            num/=10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.print("Enter base : ");
        int base=sc.nextInt();

        int value=baseToDecimal(num, base);
        System.out.println(value);

        sc.close();
    }
}
