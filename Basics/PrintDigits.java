// print all digit of number left to right
import java.util.*;
public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        long num=sc.nextLong();

        long temp=num;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        long div=(long)Math.pow(10, count-1);

        while(div!=0){// run until div become 0.
            long quo=num/div; // dividing num by div so we can print quotient ,first digit of number
            System.out.println(quo);
            num=num%div;
            div/=10;
        }
    }

    
}
