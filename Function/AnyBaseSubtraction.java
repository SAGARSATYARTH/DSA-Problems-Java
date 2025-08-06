import java.util.Scanner;

public class AnyBaseSubtraction {

    public static int subtraction(int num1,int num2,int base){
    
        int rv=0;
        int carry=0;
        int p=1;
        while(num2>0){
            int d1=num1%10;
            int d2=num2%10;
            num1/=10;
            num2/=10;
            int d=0;
            d2=d2+carry;

            if(d2>=d1){
                carry=0;
                d=d2-d1;
            }
            else{
                carry=-1;
                d=d2+base-d1;
            }
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

        System.out.println("Sum of "+num1+" + "+num2+" is : "+subtraction(num1, num2, base));

        sc.close();
    }
    
}
