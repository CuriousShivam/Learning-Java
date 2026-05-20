//Create a program that demonstrates the differences between ArrayList and
//LinkedList. Allow users to add, remove, and retrieve elements from both
//collections. Compare and display the time taken for these operations in each
//collection type.

//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class ArrayVsLinkedLIst {
//    void main(){
//        ArrayList a = new ArrayList();
//        LinkedList l = new LinkedList();
//
//        long startTime = System.nanoTime();
//        // Your operation here
//
//        for (int i = 0; i <1000; i++){
//            System.out.println("a.add(" + i + ");");
//            a.add(i);
//        }
//        a.remove(Integer.valueOf(500));
//
//        a.remove(Integer.valueOf(900));
//
//        System.out.println(a);
//
//        long endTime = System.nanoTime();
//        long durationInNanoseconds = (endTime - startTime);
//
//        // Convert to milliseconds if needed
//        long durationInMilliseconds = durationInNanoseconds / 1_000_000;
//        System.out.println("Execution time: " + durationInMilliseconds + " ms");
//
////
//    }
//
//}


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayVsLinkedLIst {

    private static final int ELEMENT_COUNT = 100_000;
    private static final int OPERATION_COUNT = 10_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("=== BENCHMARKING: " + ELEMENT_COUNT + " ELEMENTS ===");

        // 1. Benchmark Adding Elements
        System.out.println("\n--- 1. Adding Elements at the End ---");
        System.out.printf("ArrayList  : %.3f ms%n", benchmarkAdd(arrayList));
        System.out.printf("LinkedList : %.3f ms%n", benchmarkAdd(linkedList));

        // 2. Benchmark Retrieving Elements (Random Access)
        System.out.println("\n--- 2. Random Access (Retrieving Elements) ---");
        System.out.printf("ArrayList  : %.3f ms%n", benchmarkGet(arrayList));
        System.out.printf("LinkedList : %.3f ms%n", benchmarkGet(linkedList));

        // 3. Benchmark Removing Elements from the Middle
        System.out.println("\n--- 3. Removing Elements from the Middle ---");
        System.out.printf("ArrayList  : %.3f ms%n", benchmarkRemove(arrayList));
        System.out.printf("LinkedList : %.3f ms%n", benchmarkRemove(linkedList));
    }

    // Measures time taken to append elements
    private static double benchmarkAdd(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0;
    }

    // Measures time taken for random index lookups
    private static double benchmarkGet(List<Integer> list) {
        Random random = new Random();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT; i++) {
            int randomIndex = random.nextInt(ELEMENT_COUNT);
            list.get(randomIndex);
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0;
    }

    // Measures time taken to remove elements from shifting positions
    private static double benchmarkRemove(List<Integer> list) {
        long start = System.nanoTime();
        // Remove from the middle index to force shifting/traversal
        for (int i = 0; i < OPERATION_COUNT; i++) {
            list.remove(list.size() / 2);
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0;
    }
}

// Why the Performance Differs
// 1. Adding ElementsArrayList wins / ties: It stores items in a contiguous array.
// Appending is an \(O(1)\) operation unless the array needs resizing.
// LinkedList is slower: It must instantiate a new Node object for every element, which creates memory overhead.
// 2. Retrieving Elements (get)ArrayList is lightning fast (\(O(1)\)):
// It calculates the memory address instantly based on the index.
// LinkedList is very slow (\(O(N)\)): It cannot jump to an index.
// It must start at the head node and follow pointers one by one until it reaches the index.
// 3. Removing Elements from the MiddleArrayList requires shifting (\(O(N)\)):
// When an item is removed,
// all subsequent items must be moved one slot to the left in memory.
// LinkedList requires traversal (\(O(N)\)): While the actual deletion (unlinking pointers) is fast,
// finding the middle element first requires traversing half the list, making it slow for large sizes.
