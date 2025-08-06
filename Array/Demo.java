import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]; // array declaration;
        arr=new int[5]; //assignment

        int marks[]=new int[5]; // declaration + assignment

        // arrName.length - its give length of array
        System.out.println("Enter "+marks.length+" Students marks : ");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Students marks : ");
        for(int i=0;i<marks.length;i++){
            System.out.println("Student "+(i+1)+" : "+marks[i]);
        }
        sc.close();
    }
}
