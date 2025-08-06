// you are a given a base b,and number n1 and n2 of base b then add n1 and n2 in base b.

import java.util.Scanner;

public class AnyBaseAddition {
    public static int addition(int num1,int num2,int base){
        int rv=0;
        int carry=0;
        int p=1;
        while(num1>0 || num2>0 || carry>0){
            int d1=num1%10;
            int d2=num2%10;
            num1/=10;
            num2/=10;
            int d=d1+d2+carry;
            carry=d/base;
            d=d%base;
            rv+=d*p;
            p=p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter number2 : ");
        int num2=sc.nextInt();
        System.out.print("Enter base : ");
        int base=sc.nextInt();

        System.out.println("Sum of "+num1+" + "+num2+" is : "+addition(num1, num2, base));

        sc.close();
    }

}
