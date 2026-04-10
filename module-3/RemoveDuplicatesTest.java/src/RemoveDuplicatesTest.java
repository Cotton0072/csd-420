import java.util.ArrayList;
import java.util.Random;

public class RemoveDuplicatesTest {

    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        Random rand = new Random();

        // Fill with 50 random integers from 1 to 20
        for (int i = 0; i < 50; i++) {
            originalList.add(rand.nextInt(20) + 1);
        }

        // Display original list
        System.out.println("Original List (50 values):");
        System.out.println(originalList);

        // Remove duplicates
        ArrayList<Integer> noDuplicates = removeDuplicates(originalList);

        // Display new list
        System.out.println("\nList After Removing Duplicates:");
        System.out.println(noDuplicates);
    }

    // Generic method to remove duplicates
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();

        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
