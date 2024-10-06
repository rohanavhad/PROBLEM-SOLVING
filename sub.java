public class sub {
    public static String isSubstring(String Input1, String Input2) {
        // Use the contains() method to check if Input2 is a substring of Input1
        if (Input1.contains(Input2)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        String Input1 = "abac";
        String Input2 = "ab";
        System.out.println("Output: " + isSubstring(Input1, Input2)); // Output: yes
        
        // Test Case 2
        Input1 = "abab";
        Input2 = "baaa";
        System.out.println("Output: " + isSubstring(Input1, Input2)); // Output: no
    }
}
