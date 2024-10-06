import java.util.HashSet;

public class dupl {
    public static HashSet<String> s1 (String d) {
        HashSet<String>s=new HashSet<>();
        
        for (int i = 0; i < d.length(); i++) {
            
            s.add(String.valueOf(d.charAt(i)));
        }
         return s;
    }
    public static void main(String[] args) {
        String input = "programming";
        HashSet<String>s=new HashSet<>();

        // Print the result
        System.out.println("After removing duplicates: " + s1(input));
    }
}
