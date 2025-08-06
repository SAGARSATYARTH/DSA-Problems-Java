import java.util.Scanner;

public class AnyBaseMultiplication {

    public static int getProduct(int num1,int num2,int base){
        int rv=0;
        int p=1;
        while(num2>0){
            int d2=num2%10;
            num2=num2/10;
            int sprd=getProduct(base, num1, d2);
            rv=addition(base,rv,sprd*p);
            p=p*10;
        }
        return rv;
    }
    public static int addition(int base,int num1,int num2){
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

    public static int multiplication(int base,int num1,int d2){
    
        int rv=0;
        int carry=0;
        int p=1;
        while(num1>0 || carry>0){
            int d1=num1%10;
            num1/=10;
            int d=d1*d2+carry;
            carry=d/base;
            d=d%base;

            rv=rv+d*p;
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

        System.out.println("Multiplication of "+num1+" + "+num2+" is : "+multiplication(base, num1, num2));

        sc.close();
    }
    
}
