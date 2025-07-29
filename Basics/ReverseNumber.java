// Print the digit of number in reverse 
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        long num=sc.nextLong();

        while(num!=0){
            long rem=num%10;
            System.out.println(rem);
            num/=10;
        }
    }
    
}
