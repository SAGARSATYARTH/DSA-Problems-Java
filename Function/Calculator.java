import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1=scn.nextInt();

        System.out.print("Enter num2 : ");
        int num2=scn.nextInt();

        calculator(num1,num2);

        scn.close();
    }
    public static void calculator(int num1,int num2){
        System.out.println("Sum : "+(num1+num2));
        System.out.println("Sub : "+(num2-num1));
        System.out.println("Multiply : "+num1*num2);
        System.out.println("Div : "+num2/num1);
    }
}
