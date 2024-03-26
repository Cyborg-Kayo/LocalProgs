import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {
    public static void main(String[] args) {
        List<String> mainArray = Arrays.asList("Hello World", "This is a test", "Another example");
        List<String> newStrings = Arrays.asList("Adding", "more", "strings");

        // List<String> resultArray = addStringsToArray(mainArray, newStrings);
        System.out.println(mainArray);
    }

    // public static List<String> addStringsToArray(List<String> mainArray, List<String> newStrings) {
    //     // Step 1: Split the main array elements into individual strings
    //     List<String> allStrings = new ArrayList<>();
    //     for (String element : mainArray) {
    //         String[] words = element.split("\\s+");
    //         allStrings.addAll(Arrays.asList(words));
    //     }

    //     // Step 2: Add the new strings to the resulting array
    //     allStrings.addAll(newStrings);

    //     return allStrings;
    // }
}
