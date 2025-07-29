// Rotate a number by given digits
import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number : ");
        long num=sc.nextInt();

        System.out.print("Rotation number : ");
        int rtn=sc.nextInt();
        long temp=num;
        int digits=0;
        while (temp!=0) {
            temp/=10;
            digits++;
        }
        rtn=rtn%digits;
        if(rtn<0){
            rtn=rtn+digits;
        }
        int div=(int)Math.pow(10, rtn);
        int mul=(int)Math.pow(10, digits-rtn);


        long rotated=(num/div)+mul*(num%div);
        System.out.println(rotated);
        
        sc.close();
    }
}
