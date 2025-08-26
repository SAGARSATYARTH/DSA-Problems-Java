import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter no of disk :");
        int disk=scn.nextInt();

        System.out.println("Enter tower name ");
        char t1=scn.next().charAt(0);
        char t2=scn.next().charAt(0);
        char t3=scn.next().charAt(0);

        toh(disk,t1,t2,t3);
    }

    public static void toh(int disk,char t1,char t2,char t3){
        if(disk==0){ 
            return;
        }
            toh(disk-1, t1, t3, t2);
            System.out.println(disk+" ("+t1+","+t2+")");
            toh(disk-1, t3, t2, t1);
    }

    
}
