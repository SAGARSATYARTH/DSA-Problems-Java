// You are given a number n and a digit d ,then calculate the frequency of digit d in number n.
import java.util.*;

class DigitsFrequency {
    public static int digitFrequency(int num,int digit){
        int count=0;
        while(num!=0){
            int rem=num%10;
            num/=10;
            if(rem==digit){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.print("Enter digit : ");
        int digit=sc.nextInt();

        System.out.println("Digit "+digit+" in number "+num+" are "+digitFrequency(num, digit)+" times");

        sc.close();
    }

    
}