import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapBuiltIn {
    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        heap.add(40);
        heap.add(15);
        heap.add(30);
        heap.add(10);
        heap.add(50);
        heap.add(25);

        System.out.println("Heap: " + heap);

        // Maximum element
        System.out.println("Maximum: " + heap.peek());

        // Extract maximum element
        System.out.println("Extract Max: " + heap.poll());

        // Heap after deletion
        System.out.println("Heap after deletion: " + heap);
    }
}