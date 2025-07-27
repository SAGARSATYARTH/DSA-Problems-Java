import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // this is used for taking input from the user.
        System.out.print("Enter your name : ");
        String name=sc.nextLine();
        System.out.print("Enter your age : ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("Hello "+name+", You can Vote");
        }
        else{
            System.out.println("Sorry, "+name+" You can not vote");
        }
        // here is a problem ,if we want to take age first and name last then our program not work properly

        // System.out.print("Enter your age : ");
        // int age1=sc.nextInt();

        // System.out.print("Enter your name : ");
        // String name1=sc.nextLine();

        // if(age1>=18){
        //     System.out.println("Hello "+name1+", You can Vote");
        // }
        // else{
        //     System.out.println("Sorry, "+name1+" You can not vote");
        // }
        
        // for out come this proble we can use

        System.out.print("Enter your age : ");
        int age2=sc.nextInt();
        sc.nextLine();// solution extra nextLine();

        System.out.print("Enter your name : ");
        String name2=sc.nextLine();

        if(age2>=18){
            System.out.println("Hello "+name2+", You can Vote");
        }
        else{
            System.out.println("Sorry, "+name2+" You can not vote");


        }    
        sc.close();// closing scanner 
    }
}
