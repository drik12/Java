import java.util.PriorityQueue;

public class MinHeapBuiltIn {

    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(40);
        heap.add(15);
        heap.add(30);
        heap.add(10);
        heap.add(50);
        heap.add(25);

        System.out.println("Heap: " + heap);

        System.out.println("Minimum: " + heap.peek());

        System.out.println("Extract Min: " + heap.poll());

        System.out.println("Heap after deletion: " + heap);
    }
}