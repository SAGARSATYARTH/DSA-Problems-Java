import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // Scanner scn=new Scanner(System.in);
        // String name="Java"; 
        // System.out.println(name);
        
        // String s1=scn.next();  // taking input a single word
        // System.out.println(s1);
        // scn.nextLine();
        // String s2=scn.nextLine(); //taking input the line
        // System.out.println(s2);


        // String s1=scn.nextLine();
        // System.out.println(s1);
        // System.out.println();
        // System.out.println(s1.length()); // length
        // System.out.println();
        // System.out.println(s1.charAt(4)); // charAt
        // System.out.println();

        // for(int i=0;i<s1.length();i++){
        //     System.out.println(s1.charAt(i));
        // }
        // System.out.println();
        // System.out.println(s1.substring(0, 3));

        // String s1="abcd";
        // System.out.println("Sub string : ");
        // for(int i=0;i<s1.length();i++){
        //     for(int j=i+1;j<=s1.length();j++){
        //        System.out.println(s1.substring(i, j));
        //     }
        // }

        // String s1="Hello";
        // String s2="World";
        // String s3=s1+" "+s2; // concatenation
        // System.out.println(s3);

        // String s4="Hello";
        // s4+=' ';
        // s4+='W';
        // s4+="orld";
        // s4+=' ';
        // s4+="8105";
        // System.out.println(s4);

        String s1="abc def ghi jkl";
        String parts[]=s1.split(" ");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }
    }

}
