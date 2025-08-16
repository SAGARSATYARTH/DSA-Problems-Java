// remove Prime number from an arrayList
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFormArrayList {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number of element : ");
        int n=scn.nextInt();

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        System.out.println("ArrayList values :");
        System.out.println(al);
        solution(al);
        System.out.println("ArrayList without Prime Number : ");
        System.out.println(al);

        scn.close();
    }
    public static void solution(ArrayList<Integer>al){
        for(int i=al.size()-1;i>=0;i--){
            int val=al.get(i);
            if(isPrime(val)==true){
                al.remove(i);
            }
        }
    }

    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
