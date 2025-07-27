// Loops in Java
public class loops {
    public static void main(String[] args) {
        // for loop
        for(int i=1;i<=10;i++){ // this loop will strat from 1 and goes upto 10;
            System.out.println(i);
        }
        int i=1;// initializing for while loop i=1
        while(i<=10){ // check condition 
            System.out.println(i); // then print 
            i++; // i increment by 1.
        }
        int x=1;
        do{// this loop print x atleast once if condtion is false
            System.out.println(x);
            x++;
        }while (x<=10);
            
    }
}

