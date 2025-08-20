import java.util.Scanner;

public class SumTwoDigit {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1=scn.nextInt();

        System.out.print("Enter num2 : ");
        int num2=scn.nextInt();

        System.out.println(sum(num1,num2));

        scn.close();
    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    
}
