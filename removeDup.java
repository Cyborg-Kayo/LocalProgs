import java.util.*;

public class removeDup {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2));
        int i = 0, n = arr.size();

        // Iterating through the array
        for (int j = 1; j < n; j++) {
            // If the current element is not equal to the previous element,
            // then increment i and update arr[i] with the current element
            if (!arr.get(j).equals(arr.get(i))) {
                i++;
                arr.set(i, arr.get(j));
            }
        }
        // Returning the length of the array after removing duplicates
        System.out.println(i + 1);
        System.out.println(arr);
    }
    
}
