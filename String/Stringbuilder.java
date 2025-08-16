public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
         
        System.out.println(sb.charAt(0)); // get

        sb.setCharAt(0, 'd');
        System.out.println(sb); // update

        System.out.println(sb.insert(2,'Y')); //insert

        sb.deleteCharAt(2);//remove
        System.out.println(sb);

        sb.append('g');
        System.out.println(sb);

        System.out.println(sb.length());
    }
    
}
