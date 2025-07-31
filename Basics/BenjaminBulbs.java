//  There are n numbers of bulb and n numbers of fluctuation happen in circuit
// if initially all bubls are off then after fluction ,how many bulbs still on.


import java.util.*;;
public class BenjaminBulbs {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of bulbs : ");
        int num=sc.nextInt();

        for(int i=1;i*i<=num;i++){
            System.out.println(i*i);
        }
    }
}
