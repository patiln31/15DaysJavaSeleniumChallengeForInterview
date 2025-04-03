package Day3;

import java.util.*;

public class RemoveDuplicates {

    /**
     * Removes duplicate integers from the input array.
     *
     * @param nums the input array containing integers
     * @return an array with duplicates removed, preserving the original order
     */
    public static int[] removeDuplicates(int[] nums) {
        // Using LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        // Adding each number to the set, duplicates will be ignored
        for (int num : nums) {
            uniqueSet.add(num);
        }

        // Converting the set back to an array of integers
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        // Example input array with duplicates
        int[] input = {4, 2, 9, 4, 2, 8};

        // Printing the array after removing duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(removeDuplicates(input)));
    }
}