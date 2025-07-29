// Count how many digits in a number and print the value..
import java.util.*;
public class DigitsCounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number : ");
        long num=sc.nextLong();

        int count=0;
        long temp=num;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("The total digits in "+temp+" is : "+count);
    }
    
}
