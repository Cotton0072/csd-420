import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraversalTest {

    public static void main(String[] args) {

        System.out.println("=== Testing with 50,000 integers ===");
        runTest(50000);

        System.out.println("\n=== Testing with 500,000 integers ===");
        runTest(500000);
    }

    public static void runTest(int size) {

        LinkedList<Integer> list = new LinkedList<>();

        // Fill the LinkedList
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // --- Test 1: Iterator traversal ---
        long startIterator = System.nanoTime();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        long endIterator = System.nanoTime();
        long iteratorTime = endIterator - startIterator;

        // --- Test 2: get(index) traversal ---
        long startGet = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        long endGet = System.nanoTime();
        long getTime = endGet - startGet;

        // Print results
        System.out.println("List size: " + size);
        System.out.println("Iterator traversal time: " + iteratorTime + " ns");
        System.out.println("get(index) traversal time: " + getTime + " ns");
    }
}
