import java.util.Scanner;

public class DiffTwoArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter arr 2 size : ");
        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter "+n2+" numbers :");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }

        System.out.print("Enter arr 1 size : ");
        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter "+n1+" numbers :");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int sub[]=new int[n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sub.length-1;

        int carry=0;
        while(k>=0){
            int d=0;
            int arr1v= i>=0?arr1[i]:0;

            if(arr2[j]+carry >=arr1v){
                d=arr2[j]+carry-arr1v;
                carry=0;
            }
            else{
                d=arr2[j]+carry+10-arr1v;
                carry=-1;
            }
            

            sub[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<sub.length){
            if(sub[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx<sub.length){
            System.out.println(sub[idx]);
            idx++;
        }
        scn.close();
    }
    
}
