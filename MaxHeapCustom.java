public class MaxHeapCustom {

    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MaxHeapCustom() {
        capacity = 100;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent index
    int parent(int i) {
        return (i - 1) / 2;
    }

    // Get left child index
    int left(int i) {
        return 2 * i + 1;
    }

    // Get right child index
    int right(int i) {
        return 2 * i + 2;
    }

    // Return maximum element
    Integer getMax() {
        if (size == 0)
            return null;
        return heap[0];
    }

    // Display heap
    void display() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }

    // Insert a new element
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    // Move the element upward
    void heapifyUp(int index) {
        while (index > 0 && heap[index] > heap[parent(index)]) {

            int temp = heap[index];
            heap[index] = heap[parent(index)];
            heap[parent(index)] = temp;

            index = parent(index);
        }
    }

    // Delete maximum element
    Integer extractMax() {

        if (size == 0)
            return null;

        if (size == 1) {
            size--;
            return heap[0];
        }

        int root = heap[0];

        // Move last element to root
        heap[0] = heap[size - 1];
        size--;

        // Restore heap
        heapifyDown(0);

        return root;
    }

    // Move element downward
    void heapifyDown(int index) {

        int largest = index;
        int left = left(index);
        int right = right(index);

        if (left < size && heap[left] > heap[largest])
            largest = left;

        if (right < size && heap[right] > heap[largest])
            largest = right;

        if (largest != index) {

            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            heapifyDown(largest);
        }
    }

    // Main method
    public static void main(String[] args) {

        MaxHeapCustom heap = new MaxHeapCustom();

        int[] elements = {40, 15, 30, 10, 50, 25};

        for (int x : elements) {
            heap.insert(x);
        }

        System.out.println("Heap:");
        heap.display();

        System.out.println("\nMaximum Element: " + heap.getMax());

        System.out.println("\nDeleted: " + heap.extractMax());

        System.out.println("\nHeap after deletion:");
        heap.display();
    }
}