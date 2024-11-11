import java.util.PriorityQueue;
import java.util.Comparator;

public class Comparator {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator for reverse ordering
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Reverse order: larger strings have higher priority
                return s2.compareTo(s1);
            }
        });

        // Add strings to the priority queue
        pq.offer("apple");
        pq.offer("banana");
        pq.offer("cherry");
        pq.offer("date");
        pq.offer("elderberry");

        // Print elements in priority order
        System.out.println("Strings in priority order (smallest at the end):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
