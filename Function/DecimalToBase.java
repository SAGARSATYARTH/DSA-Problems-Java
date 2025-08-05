// You are a decimal number n and base b then convert the number into its corresponding value in base b.

import java.util.Scanner;

public class DecimalToBase {
    public static int decToBase(int num,int base){
        int value=0;
        int count=0;
        while(num!=0){
            int rem=num%base;
            count++;
            value=value+(rem*(int)Math.pow(10, count-1));
            num/=base;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.print("Enter base : ");
        int base=sc.nextInt();

        int value=decToBase(num, base);
        System.out.println(value);

        sc.close();
    }
}
