/**
 * first
 */
public class first {
    public static String s1(String s,int n){
        String s2="";
        for(int i=0;i<n;i++){
            s2+=s;
        }
            return s2;
    }
       public static void main(String[] args) {
        String s1="abc";
        int n=3;
        System.out.println(s1(s1, n));
    }
}