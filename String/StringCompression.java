import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=scn.nextLine();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        

        scn.close();
    }

    public static String compression1(String str){
        String s=""+str.charAt(0);
        for(int i=1;i<str.length();i++){
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);

            if(cur!=prev){
                s+=cur;
            }
        }
        return s;
    }

    public static String compression2(String str){
        String s=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);

            if(cur==prev){
                count++;
            }
            else{
                if(count>1){
                    s+=count;
                    count=1;
                }
                s+=cur;
                
            }
        }
        if(count>1){
            s+=count;
            count=1;
        }
        return s;
    }
    
}
