import java.util.ArrayList;

public class duplicate_num {
   public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the number is already in the result list
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        ArrayList<Integer> result = removeDuplicates(input);

        // Print the result
        System.out.println("After removing duplicates: " + result);
    }
}
