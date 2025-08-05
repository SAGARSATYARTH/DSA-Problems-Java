//You are a number n and b1 is the base of n, then convert the number into its corresponding value in base b2.

import java.util.Scanner;

public class AnyToAnyBase {
    
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

    public static int getValue(int num,int b1,int b2){
        int dec=baseToDecimal(num, b1);
        int dn=decToBase(dec, b2);

        return dn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.print("Enter base1 : ");
        int base1=sc.nextInt();
        System.out.print("Enter base2 : ");
        int base2=sc.nextInt();
    
        System.out.println(getValue(num, base1, base2));
        sc.close();
    }

}
