import java.util.Arrays;

public class seven {
    public static boolean a1(String s1,String s2) {
        char[]a=s1.toCharArray();
        char[]b=s2.toCharArray();

         Arrays.sort(a);
         Arrays.sort(b);
         if(Arrays.equals(a, b)){
            return true;
         }

          return false;
    }
    public static void main(String[] args) {
        String s1="abcabc";
        String s2="cbabc";
        System.out.println(a1(s1, s2));
        
    }
}
